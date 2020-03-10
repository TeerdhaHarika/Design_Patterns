package com.sample.behavioralPattern;

public class FighterKickStrategyBruceLee implements FighterKickStrategyIF {

	public void doKick() {
		String doKickStr = "FighterKickStrategyBruceLee - I kick very fast.";
		System.out.println( doKickStr );
	}

}