package omc_design_patterns.design_patterns.behavioral.interpreter.robot;

import omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree.MoveLeftCommand;
import omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree.MoveRepeatCommand;
import omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree.RobotCommand;

public class RobotController {

	public static void main(String[] args){
		RobotMovementActuator robotSensor = new RobotMovementActuator();
		Robot robot = new Robot(robotSensor);
		RobotCommand robotRepeatMove = new MoveRepeatCommand(new MoveLeftCommand(),5);
		robot.getRobotActuator().interpretCommand(robotRepeatMove);
		System.out.println("First command run success.");
		RobotCommand repeatRobotRepeatMove = new MoveRepeatCommand(robotRepeatMove, 2);
		robot.getRobotActuator().interpretCommand(repeatRobotRepeatMove);
		System.out.println("Second command run success.");
	}
}
