package groovy_integration

class ClosureUtil
{

  def doubler()
  {
    { it -> it * 2 }
  }

}
