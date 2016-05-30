package MarsRover.main;

import MarsRover.Exception.CoordinateOutOfBoundsException;

/**
 * Created by kd on 29/05/2016.
 */
public class Coordinates {
    public static final int LOWER_BOUND = 0;
    private int xCoordinate;
    private int yCoordinate;
   // private Plateau plateau=new Plateau(5,5);
    public Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setYCoorinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public boolean isValidXCoordinate(int xCoordinateLimit) {
        if ( xCoordinateLimit >=this.xCoordinate ) {
            return true;
        }
        return false;
    }

    public boolean isValidYCoordinate(int yCoordinateLimit) {
        if ( yCoordinateLimit>= this.yCoordinate) {
            return true;
        }
        return false;
    }

    public boolean isValidLowerXCoordinate() {
        if ( LOWER_BOUND <=this.xCoordinate) {
            return true;
        }
        return false;
    }

    public boolean isValidLowerYCoordinate() {
        if(this.yCoordinate >=LOWER_BOUND)
        {
            return true;

        }
        return false;
    }

//    public void moveForward(Direction dir) {
//        switch (dir.getDirection()) {
//            case 'N':
//                if (isValidYCoordinate(yCoordinate + 1)) {
//                    yCoordinate++;
//                } else {
//                    throw new CoordinateOutOfBoundsException("Y coordinate out of bound");
//                }
//                break;
//        }
//    }
}
