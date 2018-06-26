package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

public class GameObjectPool implements IPool {

    private final int GAME_OBJECT_COUNT = 10;
    private List<GameObject> gameObjects = new ArrayList<>();

    public GameObjectPool(){

        for (int i = 0; i < GAME_OBJECT_COUNT; i++) gameObjects.add(new GameObject());

    }

    @Override
    public GameObject get() {

        if(!gameObjects.isEmpty()) {

            GameObject gameObject = gameObjects.get(0);
            gameObjects.remove(gameObject);
            return gameObject;
        }

        return null;
    }

    @Override
    public void release(GameObject gameObject) {

        gameObjects.add(gameObject);

    }
}
