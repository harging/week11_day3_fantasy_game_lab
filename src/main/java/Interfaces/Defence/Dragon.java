package Interfaces.Defence;

import Interfaces.IDefend;

public class Dragon implements IDefend {

    private int defend;

    public Dragon() {
        this.defend = 10;
    }

    @Override
    public int defend() {
        return defend;
    }
}