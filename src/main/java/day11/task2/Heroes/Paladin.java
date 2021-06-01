package day11.task2.Heroes;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {

    int scoreHealHimself = 25;
    int scoreHealTeammate = 10;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        if (health + scoreHealHimself > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += scoreHealHimself;
        }
    }

    @Override
    public void healTeammate(Hero h) {
        if (h.health + scoreHealTeammate > MAX_HEALTH) {
            h.health = MAX_HEALTH;
        } else {
            h.health += scoreHealTeammate;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
