trait Vehicle {
  val nature : String
  def move : String = s"${this.getClass.getName} can be ${nature}"
}
class Car extends Vehicle{
  val nature = "driven"
}
class Boat extends Vehicle{
  val nature = "sailed"
}
class Aeroplane extends Vehicle{
  val nature = "flown"
}

class FlyingCars extends Vehicle{
  val nature = "driven and flown"
}

class HoverCraft extends Vehicle{
  val nature = "sailed and driven"
}

class InvalidVehicle extends Vehicle {
  val nature = throw new NotImplementedError("Invalid vehicle")
}

