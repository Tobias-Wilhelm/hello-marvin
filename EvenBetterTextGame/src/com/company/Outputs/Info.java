package com.company.Outputs;

import com.company.Character.Attributes;
import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Environment.Board;
import com.company.Outputs.SpellText.MageSpellText;
import com.company.Outputs.SpellText.ThiefSpellText;
import com.company.Outputs.SpellText.WarriorSpellText;
import com.company.Spells.SpellConfig;
import com.company.Spells.WarriorSpells.WarriorSpell1;

import java.util.Random;

public class Info
{
    static String borderOfJustice = "\n----------------------------------------------\n";

    private static String openingText = "\nWelcome to the frightening Dungeon!\n" + borderOfJustice +
            "\nYou have to defeat several enemies, so choose your class, to kill them all!\n";

    private static String characterDecisionText = "\nYou have chosen to be a ";

    private static String enterDungeonText = "Taking a deep breath you enter the incredibly spooooooky dungeon.";

    private static String spawnedEnemyText = "\n # You crossed your path with a ";

    private static FightInfoText fightInfoText = new FightInfoText();

    private static AttributesText attributesText = new AttributesText();

    private static EnemyDefeatedText enemyDefeatedText = new EnemyDefeatedText();

    public static void printOpeningText()
    {
        System.out.println(openingText);
    }

    public static void printCharacterDecision(Hero hero)
    {
        System.out.println(characterDecisionText + hero.name);
    }

    public static void printEnterDungeon()
    {
        System.out.println(enterDungeonText);
    }

    public static void printSpawnedEnemy(Enemy enemy)
    {
        System.out.println(spawnedEnemyText + enemy.name + " # ");
    }

    public static void printFightInfo(Hero hero, Enemy enemy)
    {
        System.out.println(fightInfoText.profession + hero.name + fightInfoText.level + hero.level + fightInfoText.health + hero.health + "/" + hero.maxHealth + fightInfoText.mana + hero.mana + "/" + hero.maxMana + fightInfoText.healthPotions + hero.healthPotions + "\n");
        System.out.println(fightInfoText.enemy + enemy.name + fightInfoText.level + enemy.level + fightInfoText.health + enemy.health + "/" + enemy.maxHealth + "\n");
    }

    public static void printWarriorSpell1()
    {
        System.out.println(WarriorSpellText.spell1 + "\n\t >> You dealt " + SpellConfig.wS1Damage + " Damage to your enemy << ");
    }

    public static void printWarriorSpell2()
    {
        System.out.println(WarriorSpellText.spell2 + "\n\t >> Health +" + SpellConfig.ws2Heal + " << ");
    }

    public static void printWarriorSpell3()
    {
        System.out.println(WarriorSpellText.spell3);
    }

    public static void printMageSpell1()
    {
        System.out.println(MageSpellText.spell1 + "\n\t >> You dealt " + SpellConfig.mS1Damage + " Damage to your enemy << ");
    }

    public static void printMageSpell2()
    {
        System.out.println(MageSpellText.spell2 + "\n\t >> You dealt " + SpellConfig.mS2Damage + " Damage to your enemy << ");
    }

    public static void printMageSpell3()
    {
        System.out.println(MageSpellText.spell3);
    }

    public static void printThiefSpell1()
    {
        System.out.println(ThiefSpellText.spell1);
    }

    public static void printThiefSpell2()
    {
        System.out.println(ThiefSpellText.spell2 + "\n\t >> You dealt " + SpellConfig.tS2Damage + " Damage to your enemy << ");
    }

    public static void printThiefSpell3()
    {
        System.out.println(ThiefSpellText.spell3 + "\n\t >> You dealt " + SpellConfig.tS3Damage + " Damage to your enemy << " + "\n\t >> Agiligy -1 << ");
    }

    public static void printLooserSpell()
    {
        System.out.println("\n>You farted.. Loudly.." +
                "\n\t >> Your enemy is disgusted << ");
    }

    public static void printAttributesText(Attributes attributes)
    {
        System.out.println(attributesText.constitution + attributes.constitution
                + attributesText.strength + attributes.strength
                + attributesText.magicPower + attributes.magicPower
                + attributesText.agility + attributes.agility
                + attributesText.luck + attributes.luck);
    }

    public static void printEnemyDefeated()
    {
        System.out.println(enemyDefeatedText.text[new Random().nextInt(4)]);
    }

    public static void printGameOver(int clearedDungeonRooms)
    {
        System.out.println("\nYou did not manage to dodge the last attack of your enemy." +
                "\nYou died in Room #" + (clearedDungeonRooms + 1) + "." +
                "\n\n\t >> GAME OVER << ");
    }
}
