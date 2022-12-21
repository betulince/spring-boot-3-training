package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		//this line below creates the spring application context for us
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//we created a context to manage all our beans

		//so we don't need to configure these ones because we already configured these components by adding @Component and @Autowired annotations.
		//spring framework wou ld create them for us
		//GamingConsole game = new PacmanGame();
		//GameRunner runner = new GameRunner(game); //We sent the game that we want to run as a constructor variable.
		GameRunner runner = context.getBean(GameRunner.class); //we want an instance of a gamerunner class and assign it to a new local variable
		runner.run(); //GameRunner will be able to run the MarioGame
	}

}
