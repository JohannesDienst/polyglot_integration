package groovy_integration

class ClosureOperation
{

  def op(list, action) {
    list.each { action(it) }
  }
}
