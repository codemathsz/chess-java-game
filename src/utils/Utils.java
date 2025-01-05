package utils;

public class Utils {

    public static boolean isDiagonalMove(Integer newY, Integer newX, Integer y,Integer x){
        return Math.abs(y - newY) == Math.abs(x - newX);
    }

    public static boolean isMovementOneHome(Integer newY, Integer newX,Integer y,Integer x){
        return (newY == y + 1 || newY == y - 1) || (newX == x + 1 || newX == x - 1);
    }

    public static boolean isMovementL(Integer newY, Integer newX,Integer y,Integer x){
        Integer deltaY = Math.abs(y - newY);
        Integer deltaX = Math.abs(x - newX);

        return (deltaY == 2 && deltaX == 1) || (deltaY == 1 && deltaX == 2);
    }
}
