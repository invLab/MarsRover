package MarsRover.main;

/**
 * Created by kd on 30/05/2016.
 */
public class Plateau {
    private int xCoordinateMaxLimit;
    private int yCoordinateMaxLimit;
    public Plateau(){}

    public Plateau(int xCoordinateMaxLimit,int yCoordinateMaxLimit) {
        this.xCoordinateMaxLimit=xCoordinateMaxLimit;
        this.yCoordinateMaxLimit=yCoordinateMaxLimit;
    }

    public int getxCoordinateMaxLimit() {
        return xCoordinateMaxLimit;
    }

    public void setxCoordinateMaxLimit(int xCoordinateMaxLimit) {
        this.xCoordinateMaxLimit = xCoordinateMaxLimit;
    }

    public int getyCoordinateMaxLimit() {
        return yCoordinateMaxLimit;
    }

    public void setyCoordinateMaxLimit(int yCoordinateMaxLimit) {
        this.yCoordinateMaxLimit = yCoordinateMaxLimit;
    }
}
