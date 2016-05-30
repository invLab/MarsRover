package MarsRover.main;

/**
 * Created by kd on 29/05/2016.
 */
public class Direction {
    private char direction;

    public Direction() {
    }

    public Direction(char direction) {
        this.direction = direction;

    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void updateDirection(char argument) {
        if (argument == 'L') {
            switch (this.direction) {
                case 'N':
                    this.direction = 'W';
                    break;

                case 'W':
                    this.direction = 'S';
                    break;

                case 'S':
                    this.direction = 'E';
                    break;

                case 'E':
                    this.direction = 'N';
                    break;
            }
        }
        else if(argument=='R')
        {
            switch (direction)
            {
                case 'N':
                    this.direction = 'E';
                    break;

                case 'W':
                    this.direction = 'N';
                    break;

                case 'S':
                    this.direction = 'W';
                    break;

                case 'E':
                    this.direction = 'S';
                    break;

            }
        }
    }

}
