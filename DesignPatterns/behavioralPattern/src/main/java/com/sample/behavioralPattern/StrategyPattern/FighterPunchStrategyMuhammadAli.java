package com.sample.behavioralPattern;

public class FighterPunchStrategyMuhammadAli implements FighterPunchStrategyIF {

	
	public void doPunch() {
		String doPunchStr = "FighterPunchStrategyMuhammadAli - My left punch is to sharp for you, but my right punch is to hard for you.";
		System.out.println( doPunchStr );
	}

}