package Interfaces.Weapons;

import Interfaces.IWeapon;

public class Club implements IWeapon {

    private int damage;

    public Club() {
        this.damage = 10;
    }

    @Override
    public int attack(){
        return damage;
    }
}