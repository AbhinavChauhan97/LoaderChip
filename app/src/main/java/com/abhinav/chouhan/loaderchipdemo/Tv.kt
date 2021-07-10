package com.abhinav.chouhan.loaderchipdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatCheckBox
import com.google.android.material.chip.Chip

class MyChip (context: Context,attributeSet: AttributeSet) : Chip(context,attributeSet){

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //just want to draw a diagonal line
        canvas.drawLine(0f,0f,width/1f,height/1f,paint)
    }
}