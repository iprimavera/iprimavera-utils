package com.github.iprimavera

import kotlin.math.roundToInt

fun Double.map(
    fromMin: Double, fromMax: Double,
    toMin: Double, toMax: Double
): Double = (this - fromMin) / (fromMax - fromMin) * (toMax - toMin) + toMin

fun Double.snap(step: Double): Double = (this / step).roundToInt() * step
