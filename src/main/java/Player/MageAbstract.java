package Player;

import Interfaces.IDefend;

public abstract class MageAbstract extends PlayerAbstract {

    private IDefend defend;

    public MageAbstract(String name, int hp, IDefend defend) {
        super(name, hp);
        this.defend = defend;
    }

    public void defend(IDefend defend) {
        defend.defend();
    }


}