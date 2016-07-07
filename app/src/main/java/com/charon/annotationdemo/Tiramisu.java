package com.charon.annotationdemo;

import com.charon.Factory;

/**
 * Created by xu.chuanren on 16/7/5.
 */
@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {

    @Override
    public float getPrice() {
        return 12;
    }
}