package com.abhinav.chouhan.loaderchip

import android.view.animation.LinearInterpolator

class ReverseLinearInterPolator : LinearInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return 1 - super.getInterpolation(input)
    }
}