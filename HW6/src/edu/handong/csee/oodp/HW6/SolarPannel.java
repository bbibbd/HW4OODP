package edu.handong.csee.oodp.HW6;

public class SolarPannel implements RoverElement{

	private int randomN;
	
	public SolarPannel() {
		randomN = (int)(Math.random()*2);
	}
	@Override
	public void accept(RoverElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public int getRandomN() {
		// TODO Auto-generated method stub
		return randomN;
	}

}
