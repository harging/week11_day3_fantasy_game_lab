package Player;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Warlock extends MageAbstract {

    private ISpell spell;

    public Warlock(String name, int hp, IDefend defend, ISpell spell) {
        super(name, hp, defend);
        this.spell = spell;
    }
}
