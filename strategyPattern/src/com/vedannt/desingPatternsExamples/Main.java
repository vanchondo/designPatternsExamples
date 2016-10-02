package com.vedannt.desingPatternsExamples;

import com.vedannt.desingPatternsExamples.behaviors.fly.FlyWithWings;
import com.vedannt.desingPatternsExamples.behaviors.quack.MuteQuack;
import com.vedannt.desingPatternsExamples.ducks.DecoyDuck;
import com.vedannt.desingPatternsExamples.ducks.Duck;
import com.vedannt.desingPatternsExamples.ducks.MallardDuck;
import com.vedannt.desingPatternsExamples.ducks.RedheadDuck;
import com.vedannt.desingPatternsExamples.ducks.RubberDuck;

public class Main {

    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println();

        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        System.out.println();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println();

        //Changing behavior at runtime
        rubberDuck.display();
        rubberDuck.setQuackBehavior(new MuteQuack());
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println();
    }
}
