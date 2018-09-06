package com.company.Events;

import com.company.Character.Attributes;
import com.company.Character.Enemies.Enemy;
import com.company.Character.Enemies.EnemyConfig;
import com.company.Character.Hero.Hero;
import com.company.Environment.Board;
import com.company.Items.ItemConfig;
import com.company.Outputs.Info;
import com.nivram.Console.Input;

import java.util.Random;

public class FightEvent extends Event
{
    Enemy enemy;

    public FightEvent(int difficulty, Hero hero)
    {
        super(hero);
        spawnEnemy(difficulty);
    }

    public void start(int clearedDungeonRooms)
    {
        Info.printSpawnedEnemy(enemy);
        turnLoop(clearedDungeonRooms);
    }

    void spawnEnemy(int difficulty)
    {
        Random r = new Random();
        int enemyID = r.nextInt(3);
        String enemyName = EnemyConfig.enemies[difficulty][enemyID];
        Attributes attributes = EnemyConfig.enemyAttributes[difficulty][enemyID];
        int level = r.nextInt((difficulty * 3 + r.nextInt(2)) + 1) + 1;
        enemy = new Enemy(enemyName, attributes, level);
    }

    void startFighting(int clearedDungeonRooms)
    {
        if (hero.attributes.agility >= enemy.attributes.agility)
        {
            heroTurn();
            enemyTurn();
        }
        else
        {
            enemyTurn();
            heroTurn();
        }
    }

    void turnLoop(int clearedDungeonRooms)
    {
        while (hero.health > 0 && enemy.health > 0)
        {
            startFighting(clearedDungeonRooms);
        }
        if (!(hero.health > 0))
        {
            gameOver(clearedDungeonRooms);
        }
        else
        {
            enemyDefeated();
        }
    }

    void heroTurn()
    {
        Info.printFightInfo(hero, enemy);
        if (!(hero.health > 0))
            return;

        String text = ("What would you like to do?" +
                "\n1. Attack" +
                "\n2. Cast " + hero.skillOrSpell +
                "\n3. Use Item");
        Runnable[] choices = new Runnable[]{this::caseHeroAttacksEnemy, this::caseHeroCastSpell, this::caseHeroUseItem};
        Input.choiceSwitch(text, choices, this::caseDefault);

    }

    void enemyTurn()
    {
        Info.printFightInfo(hero, enemy);
        if (!(enemy.health > 0))
        {
            return;
        }
        enemy.attack(hero);
    }

    void enemyDefeated()
    {
        Info.printEnemyDefeated();
        hero.gold += enemy.dropGold();
        hero.addExp(enemy.dropExp());

        if (new Random().nextDouble() <= ItemConfig.healthPotionDropRate)
        {
            hero.healthPotions++;
            System.out.println("\nAs you kill your enemy target, he drops something." +
                    "\n\t >> Health Potion +1 << ");
        }
    }

    private void caseHeroAttacksEnemy()
    {
        hero.attack(enemy);
    }

    private void caseHeroCastSpell()
    {
        hero.spells.useSpell(hero, enemy);
    }

    private void caseHeroUseItem()
    {
        hero.healthPotions--;
        hero.health = hero.maxHealth;

        System.out.println("\n>You grab a health potion out of your bag and drink it." +
                "\n>A warm wave goes trough your body." +
                "\n\t >> Fully healed << ");
    }

    private void caseDefault()
    {
        System.out.println("\n>You just stand there, doing nothing.");
    }
}