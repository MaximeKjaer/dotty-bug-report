/** This is a docstring */
case class Test(bool: Boolean)

@main def main(): Unit = {
    println("Test:   " + getDocString[Test])
    println("Test2:  " + getDocString[Test2])
    println("Quotes: " + getDocString[scala.quoted.Quotes])
    println("Option: " + getDocString[None.type])
}