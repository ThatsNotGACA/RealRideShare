import java.util.*;

public class Car {
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Person> passengers;
    
    public Car(int myDestination, int start){
        destination = myDestination;
        currentLocation = start;
        direction = destination>currentLocation;
        passengers = new ArrayList<Person>();
    }

    public void addPassenger(Person p){
        if(passengers.size() >= 3){
            System.out.println("ERROR: No room!");
        } else if(p.getDirection() != direction){
            System.out.println("ERROR: Trying to add person in wrong direction!");
        } else{
            passengers.add(p);
        }
    }
    public void move(){
        if(currentLocation == destination){
            return;
        }

        if(direction){
            currentLocation++;
        } else {
            currentLocation--;
        }
    }
    
    public boolean hasRoom(){

        return passengers.size() < 3;
    }
    public int getDestination(){
        return destination;
    }
    public boolean getDirection(){
        return direction;
    }
    public int getLocation(){
        return currentLocation;
    }

    public ArrayList<Person> unload() {
        ArrayList<Person> unloadedPassengers = new ArrayList<>();
        
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getDestination() == currentLocation) {
                unloadedPassengers.add(passengers.remove(i));
                i--;
            }
        }
        return unloadedPassengers;
    }    
    public String toString(){
        return super.toString() + " Destination: " + destination + " Current location: " + currentLocation + " Going right? " + direction + " Passengers: " + passengers;
    }

    
}