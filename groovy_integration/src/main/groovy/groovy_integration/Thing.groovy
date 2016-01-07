package groovy_integration

class Thing
{

  String name

  Thing(name = "Joe")
  {
    this.name = name
  }

  Thing plus(Thing another)
  {
    return new Thing(this.name + " " + another.name)
  }

}
