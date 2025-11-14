## Contents

### String Extensions

* **`isInt()`**
  Checks whether the string represents a valid integer.
* **`isDouble()`**
  Checks whether the string can be parsed as a decimal number.
* **`normalizeSpaces()`**
  Cleans extra spaces and leaves exactly one between words.

### Int Extensions

* **`digits()`**
  Returns the list of individual digits of the number.
* **`cycle(min, max)`**
  Cycles the value inside the given range: if it goes above max it wraps to max, and if it goes below min it wraps to min.
* **`percentOf(value)`**
  Calculates what percentage the integer represents over the given value.
* **`ofPercent(percentage)`**
  Returns the amount corresponding to the given percentage.

### Double Extensions

* **`map(fromMin, fromMax, toMin, toMax)`**
  Maps the value from a source range to a target range.
* **`snap(step)`**
  Snaps the value to the nearest multiple of the given step.
