package com.vedannt.desingPatternsExamples.ducks;

import com.vedannt.desingPatternsExamples.behaviors.fly.FlyNoWay;
import com.vedannt.desingPatternsExamples.behaviors.fly.FlyWithWings;
import com.vedannt.desingPatternsExamples.behaviors.quack.Quack;
import com.vedannt.desingPatternsExamples.behaviors.quack.Squeak;

/**
 * Created by vedannt on 10/2/16.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display(){
        System.out.println("It looks like a redhead duck");
    }
}
