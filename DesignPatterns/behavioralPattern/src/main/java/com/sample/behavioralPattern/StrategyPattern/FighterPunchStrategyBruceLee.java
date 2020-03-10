package com.sample.behavioralPattern;

public class FighterPunchStrategyBruceLee implements FighterPunchStrategyIF {

	
	public void doPunch() {
		String doPunchStr = "FighterPunchStrategyBruceLee - I punch always before you.";
		System.out.println( doPunchStr );
	}

}
