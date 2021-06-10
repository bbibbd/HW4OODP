package edu.handong.csee.oodp.HW6;

public class RobotArm implements RoverElement{
	
	private int randomN;
	
	public RobotArm() {
		randomN = (int)(Math.random()*2);
	}
	@Override
	public void accept(RoverElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	public int getRandomN() {
		return randomN;
	}

}
