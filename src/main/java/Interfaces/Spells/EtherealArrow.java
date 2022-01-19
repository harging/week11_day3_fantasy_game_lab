package Interfaces.Spells;

import Interfaces.ISpell;

public class EtherealArrow implements ISpell {

    private int damage;

    public EtherealArrow() {
        this.damage = 15;
    }

    @Override
    public int cast() {
        return damage;
    }
}