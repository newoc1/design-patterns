package omc_design_patterns.design_patterns.creational.prototype;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EteriBanker {

	public static void main(String[] args) {
		// The all-powerful Jackson ObjectMapper!
		ObjectMapper mapper = new ObjectMapper();
		// Our reference to the JSON file storing our eteri
		File eteriJSONFile = null;
		try {
			eteriJSONFile = Paths.get("src/main/resources/eteri.json").toFile();

			EteriRegistry.eteria = mapper.readValue(eteriJSONFile,
					new TypeReference<List<SourceEteri>>() {
					});

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Could not read file because it was empty!");
			handleEmptyEteriJSONFile(mapper, eteriJSONFile);
		}
		for (Eteri eteri : EteriRegistry.eteria) {
			EteriRegistry.eteriaNameMap.put(eteri.getName(), eteri);
		}

		Scanner in = new Scanner(System.in);
		int userCommand = 0;
		boolean terminated = false;
		EteriManager eteriManager = configureEteriManager();
		while (terminated != true) {
			listCommands();

			terminated = eteriManager.manageInput(in);
		}
		System.out.println("Bye!");

	}

	private static EteriManager configureEteriManager() {
		EteriCreator eteriCreator = new EteriCreator();
		return new EteriManager(eteriCreator);
	}

	private static void listCommands() {
		System.out.println("Please enter a command:");
		System.out
				.println("Press \"1\" to initiate a search for eteri by name.");
		System.out.println("Press \"2\" to list all Eteria.");
		System.out.println("Press \"3\" to terminate.");
	}

	private static void handleEmptyEteriJSONFile(ObjectMapper mapper,
			File eteriJSONFile) {
		if (EteriRegistry.eteria.isEmpty()) {
			System.out
					.println("There are no eteria in the file! Creating the SourceEteri.");
			try {
				List<EteriAttribute> basicAttributes = new ArrayList<>();

				// basic attribute that all new Eteri will have
				basicAttributes.add(new EteriAttribute("Ether", 1, null));

				// add to the registry for the session. Subsequent sessions will
				// of
				// course just read the now non-empty file.
				EteriRegistry.eteria.add(new SourceEteri("Source",
						basicAttributes));

				mapper.writeValue(eteriJSONFile, EteriRegistry.eteria);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
