package com.java.threading;

public class Manager extends Individual{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Individual ind1 = new Individual();
		Manager ind2 = new Manager();
		
		Role RoleMgr = new Role();
		RoleMgr.setMyindividual(ind1);
		
		Role RoleStunt = new Role();
		RoleStunt.setMyindividual(ind2);
		
		OceansTeam MyOcean = new OceansTeam();
		MyOcean.setRoleManager(RoleMgr);
		MyOcean.setRoleStunt(RoleStunt);
		
		ind1.setTask(RoleMgr);
		MyOcean.getRoleManager().executeSkill();
	
	}

}
