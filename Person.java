public class Person{
    private int destination;
    private boolean direction;
    private int startLocation;

    public Person(int myDestination, int myStartLocation){
        destination = myDestination;
        startLocation = myStartLocation;
        direction = (destination>startLocation);
        
    }


    public int getDestination(){
        return destination;
    }
    public boolean getDirection(){
        return direction;
    }
    public int startLocation(){
        return startLocation;
    }

    public String toString(){
        return super.toString() + "Start: " + startLocation + " Destination: " + destination + " Going right? " +direction;
    }



}