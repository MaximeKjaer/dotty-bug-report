object IndirectValueOf {
  // Crashes Dotty 0.19.0-RC1
  def indirectValueOf[T]: T = valueOf[T]
}
