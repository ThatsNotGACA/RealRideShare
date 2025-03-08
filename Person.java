
public class Person{
    private int destination;
    private boolean direction;
    private int start;

    public Person(int myDestination, int myStart){
        destination = myDestination;
        start = myStart;
        direction = (destination > start);
        
    }

    public int getDestination(){
        return destination;
    }
    public boolean getDirection(){
        return direction;
    }
    public int getStartLocation(){
        return start;
    }

    public String toString(){
        return "Person [Start: " + start + ", Destination: " + destination + ", Going right? " + direction + "]";
    }



}