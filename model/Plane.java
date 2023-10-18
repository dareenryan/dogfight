package jpu2016.dogfight.model;

public class Plane extends Mobile {
    private static int SPEED = 2;
    private static int  WIDTH = 100;
    private static int HEIGHT = 30;
    private int player;

    public Plane(int player, Direction direction, Position position, Dimension dimension, String image){
        super(direction, position, dimension, SPEED, image);
    }

    public void setDirection(Direction direction) {

    }

    public boolean isPlayer(int player){
        return false;
    }

    public void setDogfightModel(DogfightModel dogfightModel) {

    }

    public boolean hit(){
        return false;
    }

}
