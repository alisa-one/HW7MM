package com.company;

public class Medic extends Hero {
    public Medic( int healthe, int damage, String superAbilityType) {
        super( healthe, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic has  halthe: "+Medic.super.getHealthe()+",  damage: "+Medic.super.getDamage()+
                ",   Medic применил  "+ Medic.super.getSuperAbilityType() );

    }

}
