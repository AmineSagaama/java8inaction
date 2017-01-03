package com.asagaama.behaviorparam;

import com.asagaama.behaviorparam.domain.Apple;

/**
 * Created by asagaama on 03/01/2017.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
