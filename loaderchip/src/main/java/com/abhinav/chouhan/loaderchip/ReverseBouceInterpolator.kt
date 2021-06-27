package com.abhinav.chouhan.loaderchip

import android.view.animation.BounceInterpolator

class ReverseBouceInterpolator : BounceInterpolator() {
    override fun getInterpolation(t: Float): Float {
        return 1 - super.getInterpolation(t)
    }
}