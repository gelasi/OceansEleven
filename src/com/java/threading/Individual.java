package com.java.threading;

public class Individual implements Runnable {
	public Runnable Task = null;

	public Runnable getTask() {
		return Task;
	}

	public void setTask(Runnable task) {
		Task = task;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside Individual run");
		Task.run();
	}
	
	
	
}
