import Enemy.Orc;
import Interfaces.Defence.Dragon;
import Interfaces.Healing.Herb;
import Interfaces.Spells.GhostWolf;
import Interfaces.Weapons.Club;
import Player.Barbarian;
import Player.Cleric;
import Player.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest{
    Barbarian barbarian;
    Orc orc;
    Club club;
    Cleric cleric;
    Herb herb;
    Wizard wizard;
    Dragon dragon;
    GhostWolf ghostWolf;

    @Before
    public void before(){
        club = new Club();
        herb = new Herb();
        ghostWolf = new GhostWolf();
        dragon = new Dragon();
        barbarian = new Barbarian("Jimmy", 100, club);
        orc = new Orc(100, club);
        cleric = new Cleric("Magic Mike", 100, herb);
        wizard = new Wizard("Pete", 100, dragon, ghostWolf);
    }

    @Test
    public void canHurtOrc(){
        barbarian.attack(orc);
        assertEquals(90, orc.getHp());
    }

    @Test
    public void orcCanHurt(){
        orc.attack(barbarian);
        assertEquals(90, barbarian.getHp());
    }

    @Test
    public void orcCanHurtAndClericCanHeal(){
        orc.attack(barbarian);
        orc.attack(barbarian);
        barbarian.takeHealing(cleric);

        assertEquals(90, barbarian.getHp());
    }

    @Test
    public void orcCanHurtSageAndThenSageGetHealed(){
        orc.attack(wizard);
        wizard.takeDefense(dragon);
        assertEquals(100, wizard.getHp());
    }
}
