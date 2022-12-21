package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("jump 5 meters");
    }

    @Override
    public void down() {
        System.out.println("go down");
    }

    @Override
    public void left() {
        System.out.println("go left until you reach the end");
    }

    @Override
    public void right() {
        System.out.println("go right until you reach the end");
    }
}
