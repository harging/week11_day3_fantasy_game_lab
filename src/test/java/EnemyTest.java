import Enemy.Orc;
import Enemy.Troll;
import Interfaces.Spells.EtherealArrow;
import Interfaces.Weapons.Club;
import Interfaces.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

Troll troll;
Sword sword;
Orc orc;
Club club;
EtherealArrow etherealArrow;

    @Before
    public void before(){
    troll = new Troll(100, club);
    orc = new Orc(100, club);
    sword = new Sword();
    club = new Club();
    etherealArrow = new EtherealArrow();
    }

    @Test
    public void swordCanDamageTroll(){
    troll.takeDamage(sword);
    assertEquals(95, troll.getHp());

}

    @Test
    public void clubCanDamageOrc(){
        orc.takeDamage(club);
        assertEquals(90, orc.getHp());

    }

    @Test
    public void etherealArrowCanDamageOrc(){
        orc.takeDamage(etherealArrow);
        assertEquals(85, orc.getHp());

    }
}
