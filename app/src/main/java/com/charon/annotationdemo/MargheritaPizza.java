package com.charon.annotationdemo;

import com.charon.Factory;

/**
 * Created by xu.chuanren on 16/7/5.
 */
@Factory(
        id = "Margherita",
        type = Meal.class
)
public class MargheritaPizza implements Meal {
    @Override
    public float getPrice() {
        return 8;
    }
}