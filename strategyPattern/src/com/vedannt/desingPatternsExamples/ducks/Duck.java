package com.vedannt.desingPatternsExamples.ducks;

import com.vedannt.desingPatternsExamples.behaviors.fly.FlyBehavior;
import com.vedannt.desingPatternsExamples.behaviors.quack.QuackBehavior;

/**
 * Created by vedannt on 10/2/16.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("Swim!");
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(final FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(final QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
