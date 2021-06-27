package com.abhinav.chouhan.loaderchip

import android.view.animation.AccelerateInterpolator

class ReverseAccelerateInterpolator : AccelerateInterpolator() {

    override fun getInterpolation(input: Float): Float {
        return 1 - super.getInterpolation(input)
    }
}