package com.example;

public class Player extends СharacterClass implements Buyer {

    public Player(String name, int health, int force, int agility, int gold, int experience) {
        super(name, health, force, agility, gold, experience);
    }

    @Override
    public int buy(int cash) {

        int result = 0;
        int gold = getGold();
        int health = getHealth();
    if(gold > 0){
        System.out.println("Введите сколько золота вы готовы спустить?");
        String str1 = "potion";
        Dealer dealer = new Dealer();
       if (str1.equals(dealer.sell(Dealer.Goods.POTION)));
        gold--;
        if (gold > 0) {
            setGold(gold);
        } else {
            setGold(0);
        }
        health++;
       setHealth(health);

    }


        return result;
    }
}
