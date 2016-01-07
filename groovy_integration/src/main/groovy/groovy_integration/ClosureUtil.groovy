package groovy_integration

class ClosureUtil
{

  def static doubler() {
    { message -> message * 2 }
  }

}
