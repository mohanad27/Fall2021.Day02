//Should output the following:
/*
I own a Mustang
I own a Sienna
I own a Old Ford
*/


public class Main {
  public static void main(String[] args){
    IVehicle[] vehicles = new IVehicle[]{
      new Car("Mustang"), new Van("Sienna"), new Truck("Old Ford")
    };

    for(IVehicle vehicle : vehicles){
      System.out.println("I own a " + vehicle.getType());
    }


  }
}
