
public class Tester {
    public static void main(String[] args) {
        Person a = new Person(5,7);
        Person b = new Person(2,0);
        Person c = new Person(10,24);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println();
        
        Car car = new Car(5,9);
        System.out.println(car);
        car.addPassenger(a);
        System.out.println(car);
        System.out.println(car.unload());

        System.out.println();

        Road road = new Road();
        road.toString();
        road.pickupPassengers();
        road.moveCars();
        System.out.println(road.toString());

        road.pickupPassengers();
        road.moveCars();
        System.out.println(road.toString());

        while (car.getLocation() != car.getDestination()) {
            car.move();
            System.out.println("Car moved to: " + car.getLocation());
        }

        System.out.println("Final Car: " + car);
    }
    
}

    