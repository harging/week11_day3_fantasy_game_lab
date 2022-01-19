package Player;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Wizard extends MageAbstract {

    private ISpell spell;

    public Wizard(String name, int hp, IDefend defend, ISpell spell) {
        super(name, hp, defend);
        this.spell = spell;
    }
}
