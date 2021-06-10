package edu.handong.csee.oodp.HW6;

public interface RoverElementVisitor {
    void visit(Wheel wheel);
    void visit(Motor motor);
    void visit(RobotArm robotArm);
    void visit(Camera camera);
    void visit(SolarPannel solarPannel);
}
