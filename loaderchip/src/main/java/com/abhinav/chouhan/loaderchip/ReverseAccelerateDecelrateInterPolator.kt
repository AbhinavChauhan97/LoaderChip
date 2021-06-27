package com.abhinav.chouhan.loaderchip

import android.view.animation.AccelerateDecelerateInterpolator

class ReverseAccelerateDecelrateInterPolator : AccelerateDecelerateInterpolator() {

    override fun getInterpolation(input: Float): Float {
        return 1 - super.getInterpolation(input)
    }
}