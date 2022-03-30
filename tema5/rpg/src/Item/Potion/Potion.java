package src.Item.Potion;

import src.Character.Character;
import src.Item.Food.IConsumable;

public abstract class Potion implements IConsumable{
    private int power;

    public Potion(int power){
        this.power = power;
    }

    public void consumedBy(Character character){
        character.heals(power);
    }
}
