package omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree;

import omc_design_patterns.design_patterns.behavioral.interpreter.robot.Robot;

public class MoveLeftCommand extends TerminalRobotCommand{

	@Override
	public void interpret(Robot robot) {
		robot.moveLeft();
	}

}
