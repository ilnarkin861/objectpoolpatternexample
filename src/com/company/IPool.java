package com.company;

public interface IPool {

    GameObject get();
    void release(GameObject gameObject);
}
