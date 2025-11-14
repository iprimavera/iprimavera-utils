package com.github.iprimavera

fun String.isInt(): Boolean = this.toIntOrNull() != null

fun String.isDouble(): Boolean = this.toDoubleOrNull() != null

fun String.normalizeSpaces(): String = this.trim().replace(Regex("\\s+"), " ")
