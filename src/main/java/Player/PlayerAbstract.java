package Player;

import Interfaces.IDefend;
import Interfaces.IHeal;
import Interfaces.ISpell;
import Interfaces.IWeapon;

public abstract class PlayerAbstract {

    private String name;
    private int hp;

    public PlayerAbstract(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void takeDamage(IWeapon weapon){
        hp -= weapon.attack();
    }

    public void takeDamage(ISpell spell){
        hp -= spell.cast();
    }

    public void takeHealing(Cleric cleric) {
        hp += cleric.heal();


    }

    public void takeDefense(IDefend defend) {
        hp += defend.defend();
    }


}
