package edu.handong.csee.oodp.HW6;

public class RoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rover rover = new Rover();
		Blackbox bb = Blackbox.getBlackbox();
		
		rover.accept(new RoverElementCheckVisitor());
		rover.accept(new RoverElementWorkVisitor());
		bb.getAlarm();
	}

}
