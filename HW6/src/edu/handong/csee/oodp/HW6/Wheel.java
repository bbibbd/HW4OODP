package edu.handong.csee.oodp.HW6;

public class Wheel implements RoverElement {
	private String name;
	private int randomN;
	
	public Wheel(String name) {
		this.name = name;
		randomN = (int)(Math.random()*2);
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public int getRandomN() {
		return randomN;
	}
	

	@Override
	public void accept(RoverElementVisitor visitor) {
		visitor.visit(this);
	}
}
