package com.in28minutes.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner { //so basically we are saying that "dear spring framework when you create a gamerunner class you have
    // to create gamingconsole interface as well and then autowire it in."

    @Autowired
    private GamingConsole game; //gamerunner has a dependency of gamingconsole thats why we autowire it

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
