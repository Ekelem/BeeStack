/* Compile code in String format
 *
 * Compiling at runtime.
 */

object Compiler {

  import scala.reflect.runtime.currentMirror
  import scala.tools.reflect.ToolBox

  type CompiledExpr = () => Any

  private[this] val _compiler = {
    currentMirror.mkToolBox()
  }

  def compile(code: String): CompiledExpr = {
    val tree = _compiler.parse(code)
    _compiler.compile(tree)
  }

  def eval(code: String): Any = {
    compile(code)()
  }
}
