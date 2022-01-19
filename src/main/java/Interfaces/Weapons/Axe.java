package Interfaces.Weapons;

import Interfaces.IWeapon;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 20;
    }

    @Override
    public int attack(){
        return damage;
    }
}