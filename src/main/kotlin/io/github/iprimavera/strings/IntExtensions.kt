package io.github.iprimavera.strings

fun Int.digits(): List<Int> = this.toString().map { it.digitToInt() }

fun Int.cycle(min: Int, max: Int): Int {
    val range = max - min + 1
    return ((this - min) % range + range) % range + min
}

fun Int.percentOf(total: Int): Double = (this.toDouble() / total) * 100

fun Int.ofPercent(percent: Double): Double = this * (percent / 100.0)
