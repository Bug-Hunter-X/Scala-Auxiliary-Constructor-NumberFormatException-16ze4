```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println(s"Error converting '$s' to Int: ${e.getMessage}")
        this(0) // Or handle the error as appropriate
    }
  }
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
val obj3 = new MyClass("abc")
```
This improved version uses a `try-catch` block to handle the potential `NumberFormatException`. If the conversion fails, it prints an error message and defaults to creating a `MyClass` object with `x` set to 0.  Alternatively, you could throw a custom exception or handle the error in a more suitable manner depending on the application's requirements.