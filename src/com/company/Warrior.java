package com.company;

public class Warrior extends Hero {
    public Warrior( int healthe, int damage, String superAbilityType) {
        super( healthe, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior  has  halthe: "+Warrior.super.getHealthe()+",  damage: "+Warrior.super.getDamage()+
                ",   Warrior применил  "+ Warrior.super.getSuperAbilityType());

    }

}
