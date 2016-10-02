package com.vedannt.desingPatternsExamples.behaviors.fly;

/**
 * Created by vedannt on 10/2/16.
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
