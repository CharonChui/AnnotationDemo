package com.charon.annotationdemo;

import com.charon.Factory;

/**
 * Created by xu.chuanren on 16/7/5.
 */
@Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal{


    @Override
    public float getPrice() {
        return 4;
    }
}