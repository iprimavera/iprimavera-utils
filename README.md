## Contents

### String Extensions

* **`isInt()`**
  Checks whether the string represents a valid integer.

* **`isDouble()`**
  Checks whether the string can be parsed as a decimal number.

* **`normalizeSpaces()`**
  Removes extra whitespace and ensures exactly one space between words.

---

### Int Extensions

* **`digits()`**
  Returns the list of individual digits of the number.

* **`cycle(min, max)`**
  Cycles the value within the given range using wrap-around semantics.

* **`percentOf(value)`**
  Returns the percentage that this integer represents relative to the given value.

* **`ofPercent(percentage)`**
  Returns the amount corresponding to the given percentage.

---

### Double Extensions

* **`map(fromMin, fromMax, toMin, toMax)`**
  Maps the value from the input range to the target range.

* **`snap(step)`**
  Snaps the value to the nearest multiple of the given step.

---

## How to use it

You need to add this lines in your `build.gradle.kts`

```kotlin
repositories {
    maven("https://jitpack.io")
}
dependencies {
    implementation("com.github.iprimavera:iprimavera-utils:v0.1.0")
}
```
