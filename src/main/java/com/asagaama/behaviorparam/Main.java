package com.asagaama.behaviorparam;

import com.asagaama.behaviorparam.domain.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asagaama on 03/01/2017.
 */
public class Main {

    public static List<Apple> filterGreenApples(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory
                ) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
}
