package william.com.company;

import java.util.LinkedList;

public class Main {

    static int [][] maze = {
            {2, 1, 1, 1},
            {1, 0, 1, 1},
            {0, 0, 0, 1}
    };

    // 0 = wall
    // 1 = path
    // 2 = destination
    // y is row
    // x is col

    // Stack first in last out

    static LinkedList<Position> path = new LinkedList<Position>();

    public static void main(String[] args) {

        //start position
        Position p = new Position(0, 3);
        path.push(p);

//        int y = path.peek().y;
//        int x = path.peek().x;
//        //System.out.println(maze[y][x]);
//        maze[y][x] = 0;
//       // System.out.println(maze[y][x]);

        while (true) {
            int y = path.peek().y;
            int x = path.peek().x;

            maze[y][x] = 0;

//            System.out.println(maze[y][x]);

            // down
            if (isValid(y+1, x)) {
                if (maze[y+1][x] == 2) {
                    System.out.println("Your win!");
                    return;
                } else if (maze[y+1][x] == 1) {
                    System.out.println("Moved down");
                    path.push(new Position(y + 1, x));
                    continue;
                }
            }

            // left
            if (isValid(y, x-1)) {
                if (maze[y][x-1] == 2) {
                    System.out.println("Your win!");
                    return;
                } else if (maze[y][x-1] == 1) {
                    System.out.println("Moved Left");
                    path.push(new Position(y, x-1));
                    continue;
                }
            }


            // up
            if (isValid(y-1, x)) {
                if (maze[y-1][x] == 2) {
                    System.out.println("Your win!");
                    return;
                } else if (maze[y-1][x] == 1) {
                    System.out.println("Moved Up");
                    path.push(new Position(y-1, x));
                    continue;
                }
            }


            // right
            if (isValid(y, x+1)) {
                if (maze[y][x+1] == 2) {
                    System.out.println("Your win!");
                    return;
                } else if (maze[y][x+1] == 1) {
                    System.out.println("Moved Right");
                    path.push(new Position(y, x+1));
                    continue;
                }
            }


            path.pop();
            System.out.println("Move Back");
            if (path.size() <= 0) {
                System.out.println("No path");
                return;
            }

        }

    }

    public static boolean isValid(int y, int x) {
        //Check if not any condion meet we just return false
        if (y < 0 ||
                y >= maze.length ||
                x < 0 ||
                x >= maze[y].length // row to check col length
        ) {
            return false;
        }
        return true;
    }



}
