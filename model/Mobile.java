package jpu2016.dogfight.model;

import java.awt.*;

public abstract class Mobile implements IMobile{
    private int speed;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){}

    public Direction getDirection(){

        return this.getDirection();
    }

    public void setDirection(){}

    public Point getPosition(){
        return this.getPosition();
    }

    public Dimension getDimension(){
        return this.getDimension();
    }

    public int getSpeed(){
        return 1;
    }

    public int getWidth(){
        return 1;
    }

    public int getHeight(){
        return 1;
    }

    public void move(){}

    public void placeInArea(IArea area){}

    public boolean isPlayer(int player){return false;}

    private void moveUp(){}

    private void moveRight(){}

    private void moveDown(){}

    private void moveLeft(){}

    public Color getColor(){
        return this.getColor();
    }

    public IDogfightModel getDogfightMode(){
        return this.getDogfightMode();
    }

    public void setDogfightModel(IDogfightModel dogfightModel){}

    public boolean hit(){
        return false;
    }

    public boolean isWeapon(){
        return false;
    }

    public Image getImage(){
        return this.getImage();
    }

}
