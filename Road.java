import java.util.*;
public class Road {

    private ArrayList<Station> stations;
    private ArrayList<Person> persons;
    private ArrayList<Car> cars;
    private ArrayList<Person> completed;

    public Road(){
        cars = new ArrayList<Car>();
        for (int i = 0; i < 20; i++){
            int rand = (int)(Math.random() * 32 + 1);
            int dest = (int)(Math.random() * 2 + 1);
            int desti;
            if(dest == 1){
                desti = 1;
            } else { 
                desti = 32;
            }
            cars.add(new Car(desti, rand));
        }
        persons=new ArrayList<Person>();
        for (int i = 0; i < 50; i++){
            int rand = (int)(Math.random() * 32 + 1);
            int rand2 = (int)(Math.random() * 32 + 1);
            persons.add(new Person(rand,rand2));
        }
        stations = new ArrayList<Station>();
        for (int i = 1; i < 33; i++){
            stations.add(new Station(i));
        }
        completed = new ArrayList<Person>();

    }
    public void pickupPassengers() {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).hasRoom()) {
                for (int j = persons.size() - 1; j >= 0; j--){
                    if (persons.get(j).getStartLocation() == cars.get(i).getLocation()) {
                        cars.get(i).addPassenger(persons.remove(j)); 
                    }
                }
            }
        }
    }
    public void moveCars() {
        for (Car car : cars) {
            ArrayList<Person> unloadedPassengers = car.unload();
            for (int i = 0; i < unloadedPassengers.size(); i++) { 
                completed.add(unloadedPassengers.get(i));
            }
            car.move();
        }
    }
    public String toString(){
        String s = "Cars: \n";
        for (Car c : cars){
            s += c.toString();
            s += "\n";
        }
        s += " Waiting people: \n";
        for(Person pers : persons){
            s += pers.toString();
            s += "\n";
        }
        if(completed.size() > 0){
        s += "Completed people: \n";
        for(Person a : completed){
            s += a.toString();
            s += "\n";
        }
    }
        return s;
    }


    
}