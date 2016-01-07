package groovy_integration

class ClosureUtil
{

  def doubler() {
    { message -> message * 2 }
  }

}
