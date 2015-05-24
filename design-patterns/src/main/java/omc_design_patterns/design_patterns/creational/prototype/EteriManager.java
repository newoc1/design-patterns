package omc_design_patterns.design_patterns.creational.prototype;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import ch.qos.logback.core.net.SyslogOutputStream;

public class EteriManager {
	@Autowired
	private EteriCreator eteriCreator;

	public EteriManager(EteriCreator eteriCreator) {
		this.eteriCreator = eteriCreator;
	}

	public boolean manageInput(Scanner userCommandLine) {
		boolean terminated = false;
		String userCommand = userCommandLine.nextLine();
		if (userCommand.equals("1")) {
			searchMechanic(userCommandLine);
		} else if (userCommand.equals("2")) {
			System.out.println("pressed 2");
			System.out.println();
			for (Eteri eteri : EteriRegistry.eteria) {
				System.out.println();
				System.out.println("name: " + eteri.getName());

				for (EteriAttribute attribute : eteri.getAttributes()) {
					System.out
							.println("Attribute name: " + attribute.getName());
				}

			}
		} else if (userCommand.equals("3")) {
			terminated = true;
		} else {
			System.out.println("Command not recognized.");
		}
		System.out.println();
		return terminated;
	}

	private void searchMechanic(Scanner userCommandLine) {
		System.out
				.println("pressed 1. Enter the name of the Eteri you would like to see.");
		String eteriSearchName = userCommandLine.nextLine();
		System.out.println("You entered: " + eteriSearchName);
		System.out.println("Here is the info you requested: ");
		Eteri currentEteri = EteriRegistry.eteriaNameMap.get(eteriSearchName);
		System.out.println(currentEteri.getName() + " has ID: "
				+ currentEteri.getId());
		for (EteriAttribute attr : currentEteri.getAttributes()) {
			System.out.println(attr.getName() + " with power level: "
					+ attr.getPowerLevel());
			System.out.println("compatible with:");
			if (attr.getCompatibleEteri() == null
					|| attr.getCompatibleEteri().isEmpty()) {
				System.out.println("No compatible Eteri");
			} else {
				for (Eteri compatibleEteri : attr.getCompatibleEteri()) {
					System.out.println(compatibleEteri.getName());
				}
			}
		}
		System.out
				.println("Would you like to clone this Eteri and begin the forging process? Type \"yes\" to begin the process or \"no\" to return to main menu. ");

		String cloneDecision = userCommandLine.nextLine();
		if (cloneDecision.equalsIgnoreCase("yes")) {
			eteriCreator.beginCloningProcess(currentEteri, userCommandLine);
		} else {
			System.out.println("Typed: " + cloneDecision
					+ ". Returning to main menu.");
		}

	}
}
