package omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree;

import omc_design_patterns.design_patterns.behavioral.interpreter.robot.Robot;

public abstract class RobotCommand {

	public abstract void interpret(Robot robot);
}
