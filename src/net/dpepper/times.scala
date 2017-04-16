package net.dpepper

trait times {
  implicit class IntWithTimes(n: Int) {

    def times(): Seq[Int] = (0 to n - 1)

    def times(fn: Int => Unit): Seq[Int] = {
      val range = n.times
      range foreach(i => fn(i))

      range
    }

    // without index
    def times(fn: => Unit): Seq[Int] = {
      n.times(i => fn)
    }

  }
}
