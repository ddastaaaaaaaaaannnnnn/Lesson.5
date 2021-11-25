package com.company;

public class Main {

    public static void main(String[] args) {
        Boss strong = new Boss();
        strong.setLife(400);
        strong.setDamage(53);
        strong.setArmor("Owns lightning");
        System.out.println(strong.getLife() + " " + strong.getDamage() + " " + strong.getArmor());

        for (Hero hero : createHeroes()) {
            System.out.println("Жизнь героев "+hero.getHealth() + " " + "Урон " + hero.getDamage() + " " + "Супер пособность " + hero.getSuperpower());

        }
    }

    public static Hero[] createHeroes() {

        Hero Hedgehog = new Hero(200, 35, "ability");
        Hero squirrel = new Hero(20, 140, "plain");
        Hero wolf = new Hero(170, 42, "killer Mod");

        Hero[] hilt = new Hero[3];
        hilt[0] = Hedgehog;
        hilt[1] = squirrel;
        hilt[2] = wolf;
        return hilt;
    }
}