package edu.handong.csee.oodp.HW6;

public class RoverElementWorkVisitor implements RoverElementVisitor {
	
	Blackbox blackbox = Blackbox.getBlackbox();
	@Override
	public void visit(Wheel wheel) {
		
		// TODO Auto-generated method stub
		if(wheel.getName().equals("front left"))
			System.out.println("*** Start Working on Wheel ***\n");
		System.out.println("Acting on "+wheel.getName()+" wheel");
		
		if(wheel.getRandomN()==1) 
			System.out.println("No action on "+wheel.getName()+" Axle");
			
		else {
			System.out.println("--> Action, Removing Mud/Dust from "+wheel.getName()+" Axle");
			blackbox.addAlarm("Action: Removing Mud/Dust from "+wheel.getName()+" Axle");
		}		
	}

	@Override
	public void visit(Motor motor) {
		// TODO Auto-generated method stub
		if(motor.getName().equals("front left"))
			System.out.println("\n*** Start Working on Motor ***\n");
		System.out.println("Acting on "+motor.getName()+" Motor");
		
		if(motor.getRandomN()==1) 
			System.out.println("No action on "+motor.getName()+" motor");
		else {
			System.out.println("--> supply more power to "+motor.getName()+" motor");
			blackbox.addAlarm("Action: Supply more power to "+motor.getName()+" motor");
		}
	}

	@Override
	public void visit(RobotArm robotArm) {
		// TODO Auto-generated method stub
		System.out.println("\n... Start Working on Robot Arm ...");
		System.out.println("Action on Robot Arm");
		if(robotArm.getRandomN() ==1)
			System.out.println("No Action on Robot Arm");
		else {
			System.out.println("==>Action, Repair Robot Arm");
			blackbox.addAlarm("Action: Repair Robot Arm");
		}
	}
	@Override
	public void visit(Camera camera) {
		// TODO Auto-generated method stub
		System.out.println("\n... Start Working on Camera ...");
		System.out.println("Action on Camera");
		if(camera.getRandomN() ==1)
			System.out.println("No Action on Camera");
		else {
			System.out.println("==>Action, Repair Camera");
			blackbox.addAlarm("Action: Repair Camera");
		}
	}

	@Override
	public void visit(SolarPannel solarPannel) {
		// TODO Auto-generated method stub
		if(solarPannel.getRandomN() ==1) { //no problem
			
		}
		else {
			
			blackbox.addAlarm(" "); //TODO: add alarm
		}
		
	}

}
