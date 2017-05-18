import org.scalatest.FunSuite

class ScalateTemplateEngineTest extends FunSuite {
  test("render") {
    assert((new ScalateTemplateEngine).render() == "<p>\n    hi there reader!\n    yo 7\n</p>")
  }
}
