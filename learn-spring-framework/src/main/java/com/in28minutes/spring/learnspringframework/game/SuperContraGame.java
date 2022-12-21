package com.in28minutes.spring.learnspringframework.game;
//MarioGame class had to be in the subpackage of where we created the program

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
    // everytime user presses a button, we would want to do some actions.

    public void up() {
        System.out.println("SuperContraGame up");
    }
    public void down() {
        System.out.println("SuperContraGame down into the hole");
    }
    public void left() {
        System.out.println("SuperContraGame stop");
    }
    public void right() {
        System.out.println("SuperContraGame accelerate");
    }
}
