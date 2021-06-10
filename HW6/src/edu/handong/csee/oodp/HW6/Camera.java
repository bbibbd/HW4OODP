package edu.handong.csee.oodp.HW6;

public class Camera implements RoverElement{
	public int randomN;
	
	public Camera() {
		randomN = (int)(Math.random()*2);
	}
	public void accept(RoverElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	public int getRandomN() {
		return randomN;
	}
}
