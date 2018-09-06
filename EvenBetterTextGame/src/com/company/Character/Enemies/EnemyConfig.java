package com.company.Character.Enemies;

import com.company.Character.Attributes;

public class EnemyConfig
{
    final public static String[][] enemies = {{"Worm", "Dog", "Slime"}, {"Wolf", "Zombie", "Skeleton"}, {"Ghost", "Demon", "Slime King"}};
    final public static Attributes[][] enemyAttributes = init();

    static Attributes[][] init()
    {
        Attributes[][] result = new Attributes[3][3];
        result[0][0] = new Attributes(8, 1, 0, 1, 0);
        result[0][1] = new Attributes(10, 1, 0, 1, 0);
        result[0][2] = new Attributes(11, 2, 0, 1, 0);
        result[1][0] = new Attributes(12, 2, 0, 1, 0);
        result[1][1] = new Attributes(16, 3, 0, 1, 0);
        result[1][2] = new Attributes(13, 3, 0, 1, 0);
        result[2][0] = new Attributes(16, 4, 0, 1, 0);
        result[2][1] = new Attributes(18, 5, 0, 1, 0);
        result[2][2] = new Attributes(18, 5, 0, 1, 0);
        return result;
    }
}