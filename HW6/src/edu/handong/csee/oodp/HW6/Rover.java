package edu.handong.csee.oodp.HW6;

public class Rover implements RoverElement{
	RoverElement[] elements;

    public RoverElement[] getElements() {
        return elements.clone(); // Return a copy of the array of references.
    }
    
    public Rover() {
        this.elements = new RoverElement[]
          { new Wheel("front left"), new Wheel("front right"),
            new Wheel("back left") , new Wheel("back right"),
            new Motor("front left"), new Motor("front right"),
            new Motor("back left"), new Motor("back right"),
            new RobotArm(), new Camera(), new SolarPannel() };
    }
    
	public void accept(RoverElementVisitor visitor) {
		// TODO Auto-generated method stub
        for(RoverElement element : this.getElements()) {
            element.accept(visitor);
        }
	}
}
