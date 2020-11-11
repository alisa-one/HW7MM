package com.company;

public abstract class Hero implements HavingSuperAbility {

    private int healthe;
    private int damage;
    private String superAbilityType;



    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public static void setSuperAbilityType() {
    }

    public int getHealthe() {
        return healthe;
    }

    public void setHealthe(int healthe) {
        this.healthe = healthe;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Hero( int healthe, int damage, String superAbilityType) {
        this.healthe = healthe;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

}


