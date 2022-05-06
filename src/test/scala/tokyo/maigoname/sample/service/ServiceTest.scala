package tokyo.maigoname.sample.service

import org.scalatest.prop.TableDrivenPropertyChecks._

class ServiceTest extends org.scalatest.flatspec.AnyFlatSpec {

  val target = new Service

  "sample test" should "target value" in {
    assert(target.getMessage() == "Hello World")
  }

  private val props = Table(
    "Hello World"
  )
  forAll(props) { n =>
    assert(target.getMessage() == n)
  }
}
