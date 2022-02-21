package by.epam.training.iotask.main;

import java.io.File;

import by.epam.training.iotask.logic.IOTaskLogic;

public class Main {

	public static void main(String[] args) {
		IOTaskLogic logic = new IOTaskLogic();
		
		File fr = new File("resources/fr.txt");
		File fw = new File("resources/fw.txt");

		String textCode = logic.readFile(fr);
		logic.writeKeyWords(fw, textCode);

	}
}
