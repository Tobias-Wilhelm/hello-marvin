package com.company.Character;

import com.company.Outputs.Info;
import com.nivram.Console.Input;

public class Attributes
{
    public int constitution;
    public int strength;
    public int magicPower;
    public int agility;
    public int luck;

    public Attributes(int constitution, int strength, int magicPower, int agility, int luck)
    {
        this.constitution = constitution;
        this.strength = strength;
        this.magicPower = magicPower;
        this.agility = agility;
        this.luck = luck;
    }

    public int getMaxHealth()
    {
        return constitution * 10;
    }

    public int getMaxMana()
    {
        return (magicPower * 10)+100;
    }

    public void investSkillPoints(int skillpoints)
    {
        for (int i = 0; i < skillpoints; i++)
            investOneSkillPoint();
    }

    public void investOneSkillPoint()
    {
        Info.printAttributesText(this);
        switch (Input.askInt("Choose the attribute to level up:" +
                "\n1. Constitution" +
                "\n2. Strength" +
                "\n3. Magic Power" +
                "\n4. Agility" +
                "\n5. Luck" ))
        {
            case 1:
                constitution++;
                break;
            case 2:
                strength++;
                break;
            case 3:
                magicPower++;
                break;
            case 4:
                agility++;
                break;
            case 5:
                luck++;
                break;
            default:
                System.out.println("You failed to choose an option. So we choose for you! " +
                                    "\n\t> Constitution +1 <");
                constitution++;
                break;
        }
    }
}
