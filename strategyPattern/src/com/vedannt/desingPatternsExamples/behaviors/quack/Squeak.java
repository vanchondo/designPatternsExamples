package com.vedannt.desingPatternsExamples.behaviors.quack;

/**
 * Created by vedannt on 10/2/16.
 */
public class Squeak implements  QuackBehavior{

    @Override
    public void quack(){
        System.out.println("Squeak!");
    }
}
