package Enemy;

import Interfaces.IWeapon;
import Interfaces.ISpell;
import Player.PlayerAbstract;

public abstract class AbstractEnemy {
    private int hp;
    private IWeapon weapon;

    public AbstractEnemy(int hp, IWeapon weapon){
        this.hp = hp;
        this.weapon = weapon;
    }

    public void takeDamage(IWeapon weapon){
         hp -= weapon.attack();
    }

    public void takeDamage(ISpell spell){
        hp -= spell.cast();
    }

    public int getHp() {
        return hp;
    }

    public void attack(PlayerAbstract player) {
        player.takeDamage(weapon);
    }
}
