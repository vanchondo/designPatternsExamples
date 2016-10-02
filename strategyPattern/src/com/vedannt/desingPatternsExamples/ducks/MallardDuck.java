package com.vedannt.desingPatternsExamples.ducks;

import com.vedannt.desingPatternsExamples.behaviors.fly.FlyWithWings;
import com.vedannt.desingPatternsExamples.behaviors.quack.Quack;

/**
 * Created by vedannt on 10/2/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display(){
        System.out.println("It looks like a mallard duck");
    }
}
