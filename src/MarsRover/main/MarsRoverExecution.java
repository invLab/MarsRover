package MarsRover.main;

import java.io.*;
import java.util.*;

/**
 * Created by kd on 31/05/2016.
 */
public class MarsRoverExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xCoordinateOfPlateu = sc.nextInt();
        int yCoordinateOfPlateu = sc.nextInt();
        Plateau plateau = new Plateau(xCoordinateOfPlateu, yCoordinateOfPlateu);
        for (int roverNumber = 0; roverNumber < 2; roverNumber++) {
            int xCoordinateOfMarsRover = sc.nextInt();
            int yCoordinateOfMarsRover = sc.nextInt();
            Coordinates coordinates = new Coordinates(xCoordinateOfMarsRover, yCoordinateOfMarsRover);
            char head = sc.next().charAt(0);
            Direction direction = new Direction(head);
            MarsRovar firstMarsRover = new MarsRovar(coordinates, direction, plateau);
            String instruction = sc.next();
            firstMarsRover.nevigateMarseRover(instruction);
            System.out.println(coordinates.getXCoordinate() + " " + coordinates.getYCoordinate() + " " + direction.getDirection());
        }
    }
}
