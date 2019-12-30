import scala.compiletime.S

sealed trait HList {
    def #:[H <: Int & Singleton, This >: this.type <: HList](head: H): H #: This = head #: this
}

final case class #:[H <: Int & Singleton, T <: HList](head: H, tail: T) extends HList

sealed trait HNil extends HList 
case object HNil extends HNil

object Test {
    type Indices[X <: HList] = IndicesHelper[X, 0]

    type IndicesHelper[X <: HList, Current <: Int] <: HList = X match {
        case head #: tail => Current #: IndicesHelper[tail, S[Current]]
        case HNil => HNil
    }

    // Compiles:
    val tmp: 0 #: 1 #: HNil = 0 #: 1 #: HNil
    val noCrash: Indices[1 #: 2 #: HNil] = tmp

    // Crashes:
    val crash: Indices[1 #: 2 #: HNil] = 0 #: 1 #: HNil
}
