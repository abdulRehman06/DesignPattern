package prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {

    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit msg = (GameUnit) super.clone();// make copy of existing object
        msg.initialixe();// initialize the starting state of object
        return msg;
    }

    //initilize to start
    protected void initialixe() {
        this.position = Point3D.ZERO;
        reset(); // reset OBJ to its starting POINT
    }

    public abstract void reset();


    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }














    public GameUnit(float x, float y, float z) {
        position = new Point3D( x, y, z );
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply( distance );
        position = position.add( finalMove );
    }

    public Point3D getPosition() {
        return position;
    }
}
