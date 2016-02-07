package jython_integration;

public class Main {

  public static void main(String[] args) {
    JythonObjectFactory factory = new JythonObjectFactory(
      BuildingType.class, "building", "Building");

    BuildingType building = (BuildingType) factory.createObject();

    building.setBuildingName("BUIDING-A");
    building.setBuildingAddress("100 MAIN ST.");
    building.setBuildingId(1);

    System.out.println(building.getBuildingId() + " " +
      building.getBuildingName() + " " +
      building.getBuildingAddress());
	}
}
