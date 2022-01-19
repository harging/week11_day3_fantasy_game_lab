package Player;

import Interfaces.IHeal;

public class  Cleric extends PlayerAbstract {

    private IHeal heal;

    public Cleric(String name, int hp, IHeal heal) {
        super(name, hp);
        this.heal = heal;
    }
        public int heal(){
            return heal.heal();
        }
}
