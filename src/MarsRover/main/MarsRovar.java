package MarsRover.main;

import MarsRover.Exception.CoordinateOutOfBoundsException;

/**
 * Created by kd on 29/05/2016.
 */
public class MarsRovar {
    private Coordinates coordinates;
    private Direction direction;
    private Plateau plateau;

    public MarsRovar(Coordinates coordinates, Direction direction, Plateau plateau) {
        this.coordinates = coordinates;
        this.direction = direction;
        this.plateau = plateau;

    }

    public void turnRight(char argument) {
        direction.updateDirection(argument);
    }

    public void turnLeft(char argument) {
        direction.updateDirection(argument);
    }

    public void moveForward() {
        switch (direction.getDirection()) {
            case 'N':
                if (coordinates.isValidYCoordinate(plateau.getyCoordinateMaxLimit()-1)) {
                    coordinates.setYCoorinate(coordinates.getYCoordinate() + 1);

                } else {
                    throw new CoordinateOutOfBoundsException("OUT OF BOUND Y COORDINATE");
                }
                break;
            case 'W':
                if (coordinates.isValidLowerXCoordinate()) {
                    coordinates.setXCoordinate(coordinates.getXCoordinate() - 1);
                } else {
                    throw new CoordinateOutOfBoundsException("OUT OF BOUND LOWER X COORDINATE");
                }
                break;
            case 'S':
                if (coordinates.isValidLowerYCoordinate()) {
                    coordinates.setYCoorinate(coordinates.getYCoordinate() - 1);
                } else {
                    throw new CoordinateOutOfBoundsException("OUT OF BOUND Y COORDINATE");
                }
                break;
            case 'E':
                if (coordinates.isValidXCoordinate(plateau.getxCoordinateMaxLimit()-1 )) {
                    coordinates.setXCoordinate(coordinates.getXCoordinate() + 1);
                } else {
                    throw new CoordinateOutOfBoundsException("OUT OF BOUND X COORDINATE");
                }
                break;
        }
    }

    public void nevigateMarseRover(String instruction) {
        int index = 0;
        while (index < instruction.length()) {
            switch (instruction.charAt(index)) {
                case 'L':
                    turnLeft('L');
                    break;
                case 'R':
                    turnRight('R');
                    break;
                case 'M':
                    moveForward();
                    break;
            }
            index++;
        }
    }


}
