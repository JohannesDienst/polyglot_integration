package groovy_integration

class Humanoid implements SpeakTrait
{

  String methodMissing(String name, args)
  {
    "Method ${name.capitalize()} is missing!"
  }

  Boolean speaksLanguage(Object language)
  {
    return this.language.equals(language)
  }

}
