package model;

public class SnakeModel {
    int x;
    int y;
    Direction direction;
    boolean head;
    public SnakeModel (int x,int y, Direction direction,boolean head)
    {
        this.x=x;
        this.y=y;
        this.direction=direction;
        this.head=head;
    }
    public void changeDirection(Direction.DIRECTION compass){
        System.out.println("changeDirection");
    }
    public void getDirection(){
        System.out.println("getDirection");
    }
    public void hitCoin(){
        System.out.println("hitcoin");
    }
    public void hitwall(){
        System.out.println("hitwall");
    }
    public void hitself(){
        System.out.println("hitself");
    }
    public void setSpeed(){
        System.out.println("setSpeed");
    }
}
