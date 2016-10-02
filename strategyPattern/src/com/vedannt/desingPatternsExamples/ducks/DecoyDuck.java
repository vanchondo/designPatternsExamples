package com.vedannt.desingPatternsExamples.ducks;

import com.vedannt.desingPatternsExamples.behaviors.fly.FlyWithWings;
import com.vedannt.desingPatternsExamples.behaviors.quack.MuteQuack;

/**
 * Created by vedannt on 10/2/16.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display(){
        System.out.println("It looks like a decoy duck");
    }
}
