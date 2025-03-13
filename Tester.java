public class Tester {
    public static void main(String[] args) {
        Person a = new Person(5, 7);
        Person b = new Person(2, 0);
        Person c = new Person(10, 24);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println();

        Car car = new Car(5, 9);
        System.out.println(car);
        car.addPassenger(a);
        System.out.println(car);
        System.out.println("Unloaded: " + car.unload());

        System.out.println();

        Road road = new Road();
        road.toString();
        road.pickupPassengers();
        road.moveCars();
        System.out.println(road.toString());

        road.pickupPassengers();
        road.moveCars();
        System.out.println(road.toString());

        Station s1 = new Station(1);
        Station s2 = new Station(5);
        Station s3 = new Station(10);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.getWaitingRight().add(new Person(10, 1));
        s2.getWaitingLeft().add(new Person(1, 5));
        s3.getWaitingRight().add(new Person(20, 10));

        System.out.println("Station 1: " + s1.getWaitingRight());
        System.out.println("Station 2: " + s2.getWaitingLeft());
        System.out.println("Station 3: " + s3.getWaitingRight());

        System.out.println();

        while (car.getLocation() != car.getDestination()) {
            car.move();
            System.out.println("Car moved to: " + car.getLocation());

            if (car.getLocation() == s1.getNumber()) {
                car.addPassenger(s1.getWaitingRight().remove(0));
            } else if (car.getLocation() == s2.getNumber()) {
                car.addPassenger(s2.getWaitingLeft().remove(0));
            } else if (car.getLocation() == s3.getNumber()) {
                car.addPassenger(s3.getWaitingRight().remove(0));
            }
        }

        System.out.println("Final Car: " + car);
    }
}
