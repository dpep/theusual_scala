package net.dpepper

import org.scalatest._
import net.dpepper.theusual._


class TimesSpec extends FlatSpec with Matchers {
  behavior of "Int.times"

  it should "repeat operations" in {
    var count = 0
    3.times { count = count + 1 }

    count shouldBe 3
  }

  it should "optionally pass an index param" in {
    // no-op
    3.times(i => ())
  }

  it should "return a range" in {
    3.times shouldBe (0 to 2)
  }

  it should "be mappable" in {
    3.times.map(x => x * 2) shouldBe Seq(0, 2, 4)
  }
}
