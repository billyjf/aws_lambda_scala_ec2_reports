import org.fusesource.scalate._

class ScalateTemplateEngine {
  def render(): String = {
    (new TemplateEngine).layout("src/main/resources/test.ssp")
  }
}
