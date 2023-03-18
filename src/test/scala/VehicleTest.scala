import org.scalatest.funsuite.AnyFunSuite
class VehicleTest extends AnyFunSuite {

  test("test for car"){
    val driving = new Car
    assert(driving.move == "Car can be driven")
  }

  test("test for Boat") {
    val sailing = new Boat
    assert(sailing.move == "Boat can be sailed")
  }

  test("test for Aeroplane") {
    val flying = new Aeroplane
    assert(flying.move == "Aeroplane can be flown")
  }

  test("test for Flying Cars") {
    val drivenFlown = new FlyingCars
    assert(drivenFlown.move == "FlyingCars can be driven and flown")
  }

  test("test for Hovercraft") {
    val sailedDriven = new HoverCraft
    assert(sailedDriven.move == "HoverCraft can be sailed and driven")
  }

  test("Test for invalid vehicle") {
    try {
      val invalidVehicle = new InvalidVehicle
    } catch {
      case _: Throwable => "Invalid vehicle"
    }
  }

}
