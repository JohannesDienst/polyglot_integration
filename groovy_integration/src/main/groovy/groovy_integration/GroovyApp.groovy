package groovy_integration

class GroovyApp
{

  // No structural Typing -> Explicit declaration

  static void main(def args)
  {
    def p = new Person()

    def robot = new C3PO()
    robot.dance("Zumba")

    def singer = new Jazzer()
    singer.sing()
    assert singer instanceof Musician
    assert singer instanceof Jazzer

    def humanoid = new Humanoid(language: "Esperanto")
    println humanoid.speak()
    println humanoid.language

    // Duck Typing
    println humanoid.write()

    // Dynamic implementation
    def speakingJazzer = new Jazzer() as SpeakTrait
    println speakingJazzer.speak()

    // SAM Types
    // TBD

    // Self Types
    // TBD

    // Operator overloading
    def thing1 = new Thing("Joe")
    def thing2 = new Thing("Doe")
    def thing3 = thing1 + thing2
    println thing3.name // Joe Doe

    // Closure
    println ClosureUtil.doubler().call(42)
  }
}
