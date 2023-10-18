package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.*;
public class DogfightModel extends Observable implements IDogfightModel{
    public DogfightModel(){}

    public IArea getArea(){
        return this.getArea();
    }

    public void buildArea(Dimension dimension){}

    public void addMobile(IMobile Mobile){}

    public void removeMobile(IMobile Mobile){}

    public ArrayList<IMobile> getMobiles(){
        return this.getMobiles();
    }

    public IMobile getMobileByPlayer(int player){
        return this.getMobileByPlayer(player);
    }

    public void setMobilesHavesMoved() {
    }
}
