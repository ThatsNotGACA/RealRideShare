public class Tester {
    public static void main(String[] args) {
        Person a = new Person(5, 7);
        Person b = new Person(2, 0);
        Person c = new Person(10, 24);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Car n = new Car(5, 9);
        System.out.println(n);

        n.addPassenger(a);
        System.out.println(n);

        while (n.getLocation() != n.getDestination()) {
            n.move();
            System.out.println("Car moved to location: " + n.getLocation());
        }

        System.out.println("Unloaded: " + n.unload());
    }
}