package groovy_integration

class Humanoid implements SpeakTrait
{

  String methodMissing(String name, args)
  {
    "${name.capitalize()}!"
  }

}
