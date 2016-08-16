import org.scalatest._
import example._

class HelloSpec extends FlatSpec with Matchers with HelloBase {

  "Hello" should "create a greeting" in {
    hello("world") should be("Hello, world!")
  }
}
