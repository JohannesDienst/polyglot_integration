package groovy_integration

class Person
{

    String name
    Integer age

    Person(name = "Anonymous", age = 0) {
      this.name = name
      this.age = age
    }

    def increaseAge(Integer years)
    {
      this.age += years
    }
}
