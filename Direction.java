package model;

public class Direction {
    DIRECTION currentDirection = DIRECTION.RIGHT;
    public enum DIRECTION {UP, DOWN, LEFT, RIGHT}
    public void changeDirection(DIRECTION compass){
//        if(this.currentDirection.equals(DIRECTION.NORTH)){
//            if(compass.equals(DIRECTION.EAST)|| compass.equals(DIRECTION.WEST)){
//                this.currentDirection=compass;
            System.out.println("change direction");
    }
    public void getDirection(){
        System.out.println("getDirection");
    }
}

