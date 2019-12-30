import scala.compiletime.S

object InfiniteLoopMatchType {
    def main(args: Array[String]): Unit = {
        // Compiles quickly:
        val a: 2 = 2
        val b: 3 = 3
        implicitly[(a.type * b.type) =:= (b.type * a.type)]

        // Infinite loop on Dotty 0.20.0-RC1
        testProd(2, 3)
    }

    def testProd(a: Int, b: Int)(given ev: (a.type * b.type) =:= (b.type * a.type)) = true

    type *[A <: Int, B <: Int] <: Int = A match {
        case 0 => 0
        case _ => MultiplyLoop[A, B, 0]
    }

    type MultiplyLoop[A <: Int, B <: Int, Acc <: Int] <: Int = A match {
        case 0 => Acc
        case S[aMinusOne] => MultiplyLoop[aMinusOne, B, B + Acc]
    }

    type +[A <: Int, B <: Int] <: Int = A match {
        case 0 => B
        case S[aMinusOne] => aMinusOne + S[B]
    }
}
