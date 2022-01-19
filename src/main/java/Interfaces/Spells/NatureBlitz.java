package Interfaces.Spells;
import Interfaces.ISpell;

public class NatureBlitz implements ISpell {

    private int damage;

    public NatureBlitz() {
        this.damage = 15;
    }

    @Override
    public int cast() {
        return damage;
    }
}

