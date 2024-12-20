```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
```
This code uses an auxiliary constructor to create a `MyClass` object from a `String`.  However, if the `String` cannot be parsed as an `Int` (e.g., it contains non-numeric characters), a `NumberFormatException` will be thrown at runtime, and the program will fail.