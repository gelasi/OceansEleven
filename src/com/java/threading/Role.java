package com.java.threading;

public class Role implements Runnable {
	private Individual myindividual = null;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside Role run method");
		
	}
	
	public void executeSkill() {
		
		new Thread(myindividual).start();
		
	}


	public Individual getMyindividual() {
		return myindividual;
	}


	public void setMyindividual(Individual myindividual) {
		this.myindividual = myindividual;
	}

}
