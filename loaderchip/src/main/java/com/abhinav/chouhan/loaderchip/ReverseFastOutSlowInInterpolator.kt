package com.abhinav.chouhan.loaderchip

import androidx.interpolator.view.animation.FastOutSlowInInterpolator

class ReverseFastOutSlowInInterpolator : FastOutSlowInInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return 1 - super.getInterpolation(input)
    }
}