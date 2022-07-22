package com.bridgelabz.di;

public class Student {
//	int id;
//	MathCheat mathcheat;
//	
//	
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public void setMathcheat(MathCheat mathcheat) {
//		this.mathcheat = mathcheat;
//	}
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	public void cheating() {
		cheat.cheat();
	}
	

//	public void setCheat(ScienceCheat cheat) {
//		this.cheat = cheat;
//	}
//
//
//	public void cheating() {
//		//mathcheat.mathCheat();  
//		cheat.scienceCheat();
//		System.out.println();
//	}
}
 