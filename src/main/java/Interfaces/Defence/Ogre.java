package Interfaces.Defence;

import Interfaces.IDefend;

public class Ogre implements IDefend {

    private int defend;

    public Ogre() {
        this.defend = 10;
    }

    @Override
    public int defend() {
        return defend;
    }
}