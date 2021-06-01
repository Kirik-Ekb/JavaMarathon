package day11.task2.Heroes;

import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0.0;
        magicDef = 0.8;

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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}

