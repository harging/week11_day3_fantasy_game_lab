package Interfaces.Spells;

import Interfaces.ISpell;

public class GhostWolf implements ISpell {

    private int damage;

    public GhostWolf() {
        this.damage = 15;
    }

    @Override
    public int cast() {
        return damage;
    }
}
