package io.github.iprimavera.strings

fun String.isInt(): Boolean =
    this.toIntOrNull() != null

fun String.normalizeSpaces(): String =
    this.trim().replace(Regex("\\s+"), " ")

//TODO IMPORTARLA A OTRO LADO y publicar