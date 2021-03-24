package com.nseindia.students;

public class Grades implements StudentInterface{
	private String name;
	private int id;
	
	private double ProjectManagement;
	private double BigData;
	private double UIUX; // User Interface and User Experience
	private double DistributedSystems;
	private double WirelessComm;
	
	private double total;
	private String Grade;
	
	
	
	
	public Grades(String name, int id, double projectManagement, double bigData, double uIUX, double distributedSystems,
			double wirelessComm) {
		super();
		this.name = name;
		this.id = id;
		ProjectManagement = projectManagement;
		BigData = bigData;
		UIUX = uIUX;
		DistributedSystems = distributedSystems;
		WirelessComm = wirelessComm;
	}

	public Grades() {
		
	}
	
	
	
	public Grades(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public double getProjectManagement() {
		return ProjectManagement;
	}

	public void setProjectManagement(double projectManagement) {
		ProjectManagement = projectManagement;
	}

	public double getBigData() {
		return BigData;
	}

	public void setBigData(double bigData) {
		BigData = bigData;
	}

	public double getUIUX() {
		return UIUX;
	}

	public void setUIUX(double uIUX) {
		UIUX = uIUX;
	}

	public double getDistributedSystems() {
		return DistributedSystems;
	}

	public void setDistributedSystems(double distributedSystems) {
		DistributedSystems = distributedSystems;
	}

	public double getWirelessComm() {
		return WirelessComm;
	}

	public void setWirelessComm(double wirelessComm) {
		WirelessComm = wirelessComm;
	}

	public double getTotal() {
		return total;
	}

	public void calculateTotal() {
		total = ProjectManagement + BigData + DistributedSystems + UIUX + WirelessComm;
//		System.out.println("The total was calculated as " + total);
		if(total>500) {
			System.out.println("You kidding me?!!!");
			Grade = "S";
		}else if (total>495) {
			Grade = "A";
		} else if (total >492) {
			Grade = "B";
		
		} else if (total >491) {
			Grade = "C";
		
		} else {
			Grade = "D";
		}
		
	}

	public String getGrade() {
		return Grade;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Grades [name=" + name + ", id=" + id + ", ProjectManagement=" + ProjectManagement + ", BigData="
				+ BigData + ", UIUX=" + UIUX + ", DistributedSystems=" + DistributedSystems + ", WirelessComm="
				+ WirelessComm + ", total=" + total + ", Grade=" + Grade + "]";
	}
}
