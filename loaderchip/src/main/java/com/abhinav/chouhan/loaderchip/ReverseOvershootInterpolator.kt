package com.abhinav.chouhan.loaderchip

import android.view.animation.OvershootInterpolator

class ReverseOvershootInterpolator : OvershootInterpolator() {

    override fun getInterpolation(t: Float): Float {
        return 1 - super.getInterpolation(t)
    }
}