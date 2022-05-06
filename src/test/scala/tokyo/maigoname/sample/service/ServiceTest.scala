package tokyo.maigoname.sample.service

class ServiceTest extends org.scalatest.flatspec.AnyFlatSpec {

  val target = new Service

  "sample test" should "target value" in {
    assert(target.getMessage() == "Hello World")
  }
}

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.propspec.AnyPropSpec
import org.scalatest.matchers.should.Matchers

class ServicePropsTest extends AnyPropSpec with TableDrivenPropertyChecks with Matchers {

  private val target = new Service

  private val props = Table(
    "Hello World1",
    "Hello World",
    "Hello World",
    "Hello World",
    "Hello World",
    "Hello World",
  )

  property("property test") {
    forAll(props) { n =>
      println(n)
      target.getMessage() shouldBe n
    }
  }
}
