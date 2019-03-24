package prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    //to reset over new object to is starting point
    public void reset()  {
        this.state = "idle";
    }

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {

        return "Swordsman " + state + " @ " + getPosition();
    }

    public void initialixe() {
        this.state = "idle";
    }


}
