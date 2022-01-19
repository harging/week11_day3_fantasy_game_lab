package Interfaces.Healing;

import Interfaces.IHeal;

public class Herb implements IHeal {

    @Override
    public int heal() {
        return 10;
    }
}
