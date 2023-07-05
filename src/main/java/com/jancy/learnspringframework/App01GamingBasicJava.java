package com.jancy.learnspringframework;

import com.jancy.learnspringframework.game.GameRunner;
import com.jancy.learnspringframework.game.MarioGame;
import com.jancy.learnspringframework.game.PacmanGame;
import com.jancy.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {


	public static void main(String[] args) {
		
		
		 //var game=new SuperContraGame();
		PacmanGame game=new PacmanGame();    //1.object creation
		GameRunner gameRunner=new GameRunner(game);   //2. Object creation + wiring of Dependencies .Game is adependency of GameRunner
          gameRunner.run();
	}

}
