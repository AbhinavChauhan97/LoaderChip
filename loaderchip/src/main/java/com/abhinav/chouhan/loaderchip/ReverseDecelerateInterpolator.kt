package com.abhinav.chouhan.loaderchip

import android.view.animation.DecelerateInterpolator

class ReverseDecelerateInterpolator : DecelerateInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return 1 - super.getInterpolation(input)
    }
}