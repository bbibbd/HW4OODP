package edu.handong.csee.oodp.HW6;

public class Motor implements RoverElement {
	private String name;
	private int randomN;
	
	public Motor(String name) {
		this.name = name;
		randomN = (int)(Math.random()*2);
	}
	public int getRandomN() {
		return randomN;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public void accept(RoverElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
