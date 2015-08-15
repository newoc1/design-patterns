package omc_design_patterns.design_patterns.behavioral.interpreter.robot.abstract_syntax_tree;

public abstract class NonterminalRobotCommand extends RobotCommand{
	private RobotCommand robotCommand;
	
	public NonterminalRobotCommand(RobotCommand robotCommand){
		this.robotCommand = robotCommand;
	}
	
	public RobotCommand getRobotCommand() {
		return robotCommand;
	}

	public void setRobotCommand(RobotCommand robotCommand) {
		this.robotCommand = robotCommand;
	}
}
