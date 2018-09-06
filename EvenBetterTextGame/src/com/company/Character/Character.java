package com.company.Character;

public class Character implements ICharacter
{
    public int health;
    public int maxHealth;

    public int mana;
    public int maxMana;

    public int gold;

    public int level;
    public String name;

    public Attributes attributes;

    public Character(String name, Attributes attributes)
    {
        this.name = name;
        this.attributes = attributes;
        resetMaxHealth();
        resetMaxMana();
        health=maxHealth;
        mana=maxMana;
    }

    @Override
    public int calculateArmor()
    {
        return 0;
    }

    @Override
    public void attack(ICharacter target)
    {
        int damageDealt = attributes.strength * 5;
        target.defend(damageDealt);
    }

    @Override
    public void defend(int enemyDamage)
    {
        int armor = calculateArmor();
        int damageTaken;

        if ((enemyDamage - armor) > 1)
        {
            damageTaken = enemyDamage - armor;
        }
        else
        {
            damageTaken = 1;
        }
        health -= damageTaken;
    }

    public void resetMaxHealth()
    {
        maxHealth = attributes.getMaxHealth();
    }

    public void resetMaxMana()
    {
        maxMana = attributes.getMaxMana();
    }

    public int dropGold()
    {
        return gold;
    }

    public int dropExp()
    {
        return (int) Math.pow(level, 2);
    }
}