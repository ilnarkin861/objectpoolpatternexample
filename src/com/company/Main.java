package com.company;

public class Main {

    public static void main(String[] args) {
        GameObjectPool pool = new GameObjectPool();
        GameObject gameObject = pool.get();
        //...
        pool.release(gameObject);
    }
}
