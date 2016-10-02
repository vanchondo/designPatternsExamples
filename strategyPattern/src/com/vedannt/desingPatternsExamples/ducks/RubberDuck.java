package com.vedannt.desingPatternsExamples.ducks;

import com.vedannt.desingPatternsExamples.behaviors.fly.FlyNoWay;
import com.vedannt.desingPatternsExamples.behaviors.quack.Squeak;

/**
 * Created by vedannt on 10/2/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display(){
        System.out.println("It looks like a rubber duck");
    }
}
