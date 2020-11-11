package com.company;

public class Main {


    public static void main(String[] args) {

        Hero[] hero = {new Magic(2000,200,"FlameFight"),
                new Medic(1500,150,"IceWall"),
                new Warrior(3000,300,"Bomb")};
        for (int i = 0; i < hero.length; i++) {

            hero[i].applySuperAbility("");
        }

    }
}

