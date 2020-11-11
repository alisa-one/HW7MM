package com.company;

public class Magic extends Hero{
    public Magic(int healthe, int damage, String superAbilityType) {
        super( healthe, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic has  halthe: "+Magic.super.getHealthe()+",  damage: "+Magic.super.getDamage()+
                ",   Magic применил  "+ Magic.super.getSuperAbilityType());

    }

}
