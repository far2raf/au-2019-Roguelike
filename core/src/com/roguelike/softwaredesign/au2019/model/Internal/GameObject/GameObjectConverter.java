package com.roguelike.softwaredesign.au2019.model.Internal.GameObject;

import java.util.HashMap;
import java.util.function.BiFunction;


public class GameObjectConverter {
    private static HashMap<Character, BiFunction<Integer, Integer, GameObject>> factoryGameObject =
            new HashMap<Character, BiFunction<Integer, Integer, GameObject>>() {{
                put(' ', Space::new);
                put('w', (i, j) -> new Border('w', i, j));
                put('@', Hero::new);
            }};


    public static BiFunction<Integer, Integer, GameObject> fromChar(char c) {
        return factoryGameObject.get(c);
    }

}
