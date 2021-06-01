package day11.task2.Heroes;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {

    int magicAtt = 15;
    int scoreHealHimself = 50;
    int scoreHealTeammate = 30;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
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
    public void magicalAttack(Hero h) {
        double attackScore = magicAtt * (1 - h.magicDef);
        if (h.health - attackScore < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
