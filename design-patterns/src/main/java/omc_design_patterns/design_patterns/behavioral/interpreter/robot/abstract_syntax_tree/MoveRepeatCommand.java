package omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree;

import omc_design_patterns.design_patterns.behavioral.interpreter.robot.Robot;

public class MoveRepeatCommand extends NonterminalRobotCommand {
	private int timesToRepeatCommand;
	public MoveRepeatCommand(RobotCommand robotCommand) {
		super(robotCommand);
	}
	public MoveRepeatCommand(RobotCommand robotCommand, int timesToRepeatCommand) {
		super(robotCommand);
		this.timesToRepeatCommand = timesToRepeatCommand;
	}

	@Override
	public void interpret(Robot robot) {
		for(int i = 0; i < timesToRepeatCommand; i++){
			this.getRobotCommand().interpret(robot);
		}
		
	}

}
