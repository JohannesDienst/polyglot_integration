package jython_integration;

public class Main
{

  public static void main(String[] args)
  {
    // Obtain an instance of the object factory
    JythonObjectFactoryPythonInterpreter factoryPythonInterpreter = new JythonObjectFactoryPythonInterpreter();

    // Call the createObject() method on the object factory by
    // passing the Java interface and the name of the Jython module
    // in String format. The returning object is casted to the the same
    // type as the Java interface and stored into a variable.
    IBuilding building1 = (IBuilding) factoryPythonInterpreter.createObject(
      IBuilding.class, "Building");
    // Populate the object with values using the setter methods
    building1.setBuildingName("Mozart Center");
    building1.setBuildingAddress("Berliner Platz 12");
    building1.setBuildingId(1);
    System.out.println(building1.getBuildingId() + " " + building1.getBuildingName() + " " +
        building1.getBuildingAddress());

    JythonObjectFactory factory = new JythonObjectFactory(
      IBuilding.class, "Building", "Building");

    IBuilding building = (IBuilding) factory.createObject();

    building.setBuildingName("Mozart Center");
    building.setBuildingAddress("Berliner Platz 12");
    building.setBuildingId(1);

    System.out.println(building.getBuildingId() + " " +
      building.getBuildingName() + " " +
      building.getBuildingAddress());
  }
}
