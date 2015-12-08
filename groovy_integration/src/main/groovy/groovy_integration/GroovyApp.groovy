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
  }
}
