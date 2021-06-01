package day11.task2.Heroes;

import day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {

    int health = 100;
    double physAtt;
    double physDef;
    double magicDef;
    final static int MIN_HEALTH = 0;
    final static int MAX_HEALTH = 100;

    @Override
    public void physicalAttack(Hero h) {
        double attackScore = physAtt * (1 - h.physDef);
        if (h.health - attackScore < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;
        }
    }
}
