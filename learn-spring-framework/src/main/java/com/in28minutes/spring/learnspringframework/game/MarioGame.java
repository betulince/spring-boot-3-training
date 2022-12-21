package com.in28minutes.spring.learnspringframework.game;
//MarioGame class had to be in the subpackage of where we created the program

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements GamingConsole {
    // everytime user presses a button, we would want to do some actions.

    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("down into the hole");
    }
    public void left() {
        System.out.println("stop");
    }
    public void right() {
        System.out.println("accelerate");
    }
}
