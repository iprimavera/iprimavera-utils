package io.github.iprimavera.strings

fun String.isInt(): Boolean = this.toIntOrNull() != null

fun String.isDouble(): Boolean = this.toDoubleOrNull() != null

fun String.normalizeSpaces(): String = this.trim().replace(Regex("\\s+"), " ")
