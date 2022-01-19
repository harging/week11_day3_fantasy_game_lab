package Interfaces.Weapons;

import Interfaces.IWeapon;

public class Sword implements IWeapon {

    private int damage;

    public Sword() {
        this.damage = 5;
    }

    @Override
    public int attack(){
        return damage;
    }
}
