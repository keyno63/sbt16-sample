package tokyo.maigoname.sample.service

class ServiceTest extends org.scalatest.flatspec.AnyFlatSpec {

  val target = new Service

  "sample test" should "target value" in {
    assert(target.getMessage() == "Hello World")
  }
}
