package com.abhinav.chouhan.loaderchip


import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.view.animation.DecelerateInterpolator
import com.google.android.material.chip.Chip
import kotlin.math.abs


class LoaderChip @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null,defStyleAttr:Int = 0) : Chip(context,attributeSet) , View.OnClickListener {


    private lateinit var borderPath:Path
    private lateinit var pathMeasure:PathMeasure
    private lateinit var loaderAnimator:ValueAnimator
    var lapDuration = 2000L
    var loaderWidth = 5f
    var loaderColor = Color.RED
    private var loaderStart = 0f
    private var loaderEnd = 0f
    var loaderStartColor = -1
    var loaderEndColor = -1
    var drawingGradient = false
    private var loaderPath = Path()
    private var shouldLoad = false
    private var wrappedClickListener:OnClickListener? = null
    var shouldStartLoadingOnClick = true
    private val loaderPaint = Paint().apply {
        isAntiAlias = true
        style = Paint.Style.STROKE
    }

    init {
        setEnsureMinTouchTargetSize(false)
        super.setOnClickListener(this)
        if(attributeSet != null) {
            val ta = context.obtainStyledAttributes(attributeSet, R.styleable.LoaderChip, 0, 0)
            val defaultLoaderWidth = resources.getDimension(R.dimen.default_loader_width)
            loaderWidth = ta.getDimension(R.styleable.LoaderChip_loaderWidth, defaultLoaderWidth)
            loaderPaint.strokeWidth = loaderWidth
            lapDuration = ta.getInteger(R.styleable.LoaderChip_lapDuration, 2000).toLong()
            shouldStartLoadingOnClick = ta.getBoolean(R.styleable.LoaderChip_loadOnClick, true)
            if (ta.hasValue(R.styleable.LoaderChip_loaderColorStart) && ta.hasValue(R.styleable.LoaderChip_loaderColorEnd)) {
                loaderStartColor = ta.getColor(R.styleable.LoaderChip_loaderColorStart, Color.WHITE)
                loaderEndColor = ta.getColor(R.styleable.LoaderChip_loaderColorEnd, Color.WHITE)
                drawingGradient = true
            } else {
                loaderColor = ta.getColor(R.styleable.LoaderChip_loaderColor, Color.RED)
            }
            ta.recycle()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        with(canvas){
            if(shouldLoad) {
                loaderPath.reset()
                pathMeasure.getSegment(loaderStart, loaderEnd, loaderPath, true)
                drawPath(loaderPath, loaderPaint)
            }
        }
    }

    override fun setOnClickListener(l: OnClickListener?) {
        wrappedClickListener = l
    }

    override fun onClick(v: View?) {
        wrappedClickListener?.onClick(v)
        if(shouldStartLoadingOnClick){
            startLoading()
        }
    }

    fun stopLoading(){
        shouldLoad = false
        loaderAnimator.end()
    }


    fun startLoading(){
        shouldLoad = true
        borderPath = Path().apply {
            addRoundRect(0f + loaderPaint.strokeWidth/2,
                0f + loaderPaint.strokeWidth/2,
                width.toFloat() - loaderPaint.strokeWidth/2,
                height.toFloat() - loaderPaint.strokeWidth/2,
                if(chipCornerRadius == 0f) height/2f else chipCornerRadius,
                if(chipCornerRadius == 0f) height/2f else chipCornerRadius,
                Path.Direction.CCW)
        }

        pathMeasure = PathMeasure(borderPath,true)

        if(drawingGradient){
            loaderPaint.shader = LinearGradient(0f,0f,pathMeasure.length/3f,loaderWidth,Color.RED,Color.YELLOW,Shader.TileMode.CLAMP)
        }else{
            loaderPaint.color = loaderColor
        }
        loaderAnimator = ValueAnimator.ofFloat(0f,1f).apply {
            duration =  lapDuration
            repeatCount = ValueAnimator.INFINITE
            interpolator = DecelerateInterpolator()
            addUpdateListener {
                val animatedValue = it.animatedValue as Float
                loaderEnd  = animatedValue * pathMeasure.length
                loaderStart = loaderEnd - ((0.5f - abs(animatedValue - 0.5f)) * pathMeasure.length)
                invalidate()
            }
        }
        loaderAnimator.start()
    }
}