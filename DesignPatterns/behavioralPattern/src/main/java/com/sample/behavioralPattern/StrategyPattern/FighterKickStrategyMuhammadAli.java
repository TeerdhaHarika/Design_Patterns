package com.sample.behavioralPattern;

public class FighterKickStrategyMuhammadAli implements FighterKickStrategyIF {

	
	public void doKick() {
		String doKickStr = "FighterKickStrategyMuhammadAli - I can't kick. I'm a boxer";
		System.out.println( doKickStr );
	}

}