package omc_design_patterns.design_patterns.behavioral.interpreter.robot;

public class Robot {
	private RobotMovementActuator robotActuator;
	public Robot(RobotMovementActuator robotActuator){
		this.setRobotActuator(robotActuator);
		robotActuator.setRobot(this);
	}
	public RobotMovementActuator getRobotActuator() {
		return robotActuator;
	}
	public void setRobotActuator(RobotMovementActuator robotActuator) {
		this.robotActuator = robotActuator;
	}
	
	public void moveLeft(){
		System.out.println("Moving left");
	}
	
	public void moveRight(){
		System.out.println("Moving right");
	}
}
