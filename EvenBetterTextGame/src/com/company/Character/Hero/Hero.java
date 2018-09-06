package com.company.Character.Hero;

import com.company.Character.Attributes;
import com.company.Character.Character;
import com.company.Spells.Spells;

public class Hero extends Character
{
    int exp;
    int maxExp;
    public int healthPotions;
    public Spells spells;

    public String skillOrSpell;

    Hero(String name, Attributes attributes, String skillOrSpell)
    {
        super(name, attributes);
        this.skillOrSpell = skillOrSpell;
        initStats();
    }

    private void initStats()
    {
        level = 1;
        exp = 0;
        healthPotions = 1;
        setMaxExp();
    }

    public void setMaxExp()
    {
        maxExp = (int) Math.pow(2, level);
    }

    public void addExp(int value)
    {
        exp += value;
        tryLevelUp();
    }

    @Override
    public int calculateArmor()
    {
        int armor = 1;

        return armor;
    }

    private void tryLevelUp()
    {
        if (exp > maxExp)
        {
            level++;
            exp -= maxExp;
            setMaxExp();
            attributes.investSkillPoints(AttributeConfig.skillPointsPerLvl);
            tryLevelUp();
            mana = maxMana;
            resetMaxHealth();
            resetMaxMana();
            health = maxHealth;
        }
    }
}