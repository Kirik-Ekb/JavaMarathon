package day11.task2;

import day11.task2.Heroes.Magician;
import day11.task2.Heroes.Paladin;
import day11.task2.Heroes.Shaman;
import day11.task2.Heroes.Warrior;

public class Task2 {
    public static void main(String[] args) {
        Warrior warior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warior.physicalAttack(paladin);
        System.out.println(paladin.toString());

        paladin.physicalAttack(magician);
        System.out.println(magician.toString());

        shaman.healTeammate(magician);
        System.out.println(magician.toString());

        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());

        shaman.physicalAttack(warior);
        System.out.println(warior.toString());

        paladin.healHimself();
        System.out.println(paladin.toString());
        System.out.println();

        for (int i = 0; i < 5; i++) {
            warior.physicalAttack(magician);
            System.out.println(magician.toString());
        }
    }
}
