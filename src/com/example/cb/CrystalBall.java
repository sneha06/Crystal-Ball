package com.example.cb;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswer ={ 
				"It is certain",
				"It is decidly so",
				"All signs say yes",
				"The stars are not aligned",
				"My rply is no",
				"It is doubtful",
				"Better not tell you now",
				"Concentrate and ask again",
				"unable to answer now ",
				"It is hard to say"
		};
	
 public String getAnAnswer(){
	
				
		// TODO Auto-generated method stub
		String answer = "";
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswer.length);
		answer = mAnswer[randomNumber];
	    return answer;		
	
 }
}
