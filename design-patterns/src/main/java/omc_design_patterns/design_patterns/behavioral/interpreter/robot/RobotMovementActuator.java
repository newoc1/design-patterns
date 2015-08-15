package omc_design_patterns.design_patterns.behavioral.interpreter.robot;

import omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree.RobotCommand;

public class RobotMovementActuator {
	private Robot robot;

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	
	public void interpretCommand(RobotCommand robotCommand){
		robotCommand.interpret(robot);
	}
	
}
