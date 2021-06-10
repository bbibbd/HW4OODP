package edu.handong.csee.oodp.HW6;

public class RoverElementCheckVisitor implements RoverElementVisitor {
	Blackbox blackbox = Blackbox.getBlackbox();

	@Override
	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub
		
		if(wheel.getName().equals("front left"))
			System.out.println("*** Start Checking Wheel ***\n");
		System.out.println("Checking "+wheel.getName()+" Axle");
		
		if(wheel.getRandomN() == 1)
			System.out.println("Wheel Axle OK");
		else {
			System.out.println(">>Alarm: Mud and Dust on WHeel Axle of "+ wheel.getName()+ " wheel");
			blackbox.addAlarm("Alarm: Mud and Dust on Wheel Axle of "+wheel.getName()+" wheel");
		}
	}
	@Override
	public void visit(Motor motor) {
		// TODO Auto-generated method stub
		if(motor.getName().equals("front left"))
			System.out.println("\n### Start Checking Motor ###\n");
		System.out.println("Checking Motors from "+motor.getName()+" motor");
		if(motor.getRandomN() == 1)
			System.out.println("Power is OK");
		else {
			System.out.println(">>Alarm: Weak Power to "+ motor.getName()+ " motor");
			blackbox.addAlarm("Alarm: Weak Power to "+motor.getName()+" motor");
		}
	}

	@Override
	public void visit(RobotArm robotArm) {
		// TODO Auto-generated method stub
		System.out.println("\n... Start Checking Robot Arm ...");
		System.out.println("Checking Robot Arm");
		if(robotArm.getRandomN()==1)
			System.out.println("Robot Arm is OK");
		else {
			System.out.println("..Alarm: Robot Arm not working properly");
			blackbox.addAlarm("Alarm: Robot Arm Not Working Properly ");
		}
	}

	@Override
	public void visit(Camera camera) {
		// TODO Auto-generated method stub
		System.out.println("\n... Start Checking Camera ...  ");
		if(camera.getRandomN()==1)
			System.out.println("Camera is OK");
		else {
			System.out.println("..Alarm: Camera not working properly");
			blackbox.addAlarm("Alarm: Camera Not Working Properly ");
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
