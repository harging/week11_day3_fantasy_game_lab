package Player;

import Enemy.AbstractEnemy;
import Interfaces.IWeapon;

public abstract class FighterAbstract extends PlayerAbstract {

    private IWeapon weapon;

    public FighterAbstract(String name, int hp, IWeapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public void attack(AbstractEnemy enemy) {
        enemy.takeDamage(weapon);
    }
}
