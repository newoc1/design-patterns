package omc_design_patterns.design_patterns.creational.prototype;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EteriCreator {

	public void beginCloningProcess(Eteri eteriToClone, Scanner userCommandLine) {
		EteriAttribute eteriAttribute;
		System.out
				.println("You will now be asked to create a new attribute for the Eteri forging process.");
		System.out.println("What is this attribute's name?");
		String attributeName = userCommandLine.nextLine();
		System.out.println("What is this attribute's power level?");
		String attributePowerLevel = userCommandLine.nextLine();

		List<Eteri> compatibleEteria = determineCompatibleEteria(userCommandLine);
		eteriAttribute = new EteriAttribute(attributeName, Integer.valueOf(
				attributePowerLevel).intValue(), compatibleEteria);
		SourceEteri clonedEteri = (SourceEteri) eteriToClone
				.clone(eteriAttribute);
		System.out
				.println("Cloning was a success! Enter a name for this new Eteri.");
		String eteriName = userCommandLine.nextLine();
		clonedEteri.setName(eteriName);
		System.out.println("The new Eteri has the following properties...");
		System.out.println(clonedEteri.getId());
		System.out.println(clonedEteri.getName());
		for (EteriAttribute attribute : clonedEteri.getAttributes()) {
			System.out.println("attribute: " + attribute.getName()
					+ " power level: " + attribute.getPowerLevel());
			System.out.println("compatible with:");
			if (attribute.getCompatibleEteri() == null
					|| attribute.getCompatibleEteri().isEmpty()) {
				System.out.println("No compatible Eteri");
			} else {
				for (Eteri compatibleEteri : attribute.getCompatibleEteri()) {
					System.out.println("Eteri with ID: "
							+ compatibleEteri.getId());
				}
			}
		}
		System.out.println("Saving Eteri.");
		saveEteri(clonedEteri);
	}

	private List<Eteri> determineCompatibleEteria(Scanner userCommandLine) {
		List<Eteri> compatibleEteria = new ArrayList<>();
		boolean notDoneAddingEteria = true;
		while (notDoneAddingEteria) {

			System.out
					.println("Choose the Eteri that is compatible. Please type a number between 0 and "
							+ (EteriRegistry.eteria.size() - 1) + ".");
			int i = 0;
			for (Eteri eteri : EteriRegistry.eteria) {
				System.out.println(i + ": name=" + eteri.getName() + " ID="
						+ eteri.getId());
			}

			String index = userCommandLine.nextLine();
			Eteri eteri = EteriRegistry.eteria.get(Integer.valueOf(index)
					.intValue());
			compatibleEteria.add(eteri);
			System.out
					.println("Do you wish to add more Eteria? Press \"yes\" to continue adding Eteria.");
			String addMoreEteriaDecision = userCommandLine.nextLine();
			System.out.println(addMoreEteriaDecision);
			if (!addMoreEteriaDecision.equalsIgnoreCase("yes")) {
				notDoneAddingEteria = false;
				System.out.println("Done adding Eteria.");
			}
		}
		return compatibleEteria;
	}

	private void saveEteri(SourceEteri clonedEteri) {
		ObjectMapper mapper = new ObjectMapper();
		File eteriJSONFile = Paths.get("src/main/resources/eteri.json")
				.toFile();
		EteriRegistry.eteria.add(clonedEteri);

		try {
			mapper.writeValue(eteriJSONFile, EteriRegistry.eteria);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
