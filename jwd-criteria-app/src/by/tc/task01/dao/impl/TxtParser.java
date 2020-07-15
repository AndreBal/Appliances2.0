package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.entity.Appliance;

public class TxtParser {
	private final static String pathToDevices = ".\\resources\\appliances_db.txt";
	private Boolean next;
	private BufferedReader reader;
	private ApplianceFactory factory;
	
	public boolean hasNext() {
		if(next == null) {
			next = false;
		}
		return next;
	}

	public void initialize() throws IOException {
		factory = new ApplianceFactoryImpl();
		Path pathToFile = Paths.get(pathToDevices);
		reader = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);
		next = true;
	}

	public Appliance parseNext() throws IOException {
		String line;
		if ((line = reader.readLine()) != null) {
			line.trim();
			if(line.equals("")) {
				return parseNext();
			}
			String[] deviceArgs = line.split(":");
			String deviceName = deviceArgs[0].trim();
			String[] characteristicsArray = deviceArgs[1].split(",");
			Map<String, String> deviceCharacteristics = new HashMap<String, String>();
			for (String s : characteristicsArray) {
				String[] characteristicAndValue = s.split("=");
				deviceCharacteristics.put(characteristicAndValue[0].trim(), characteristicAndValue[1].trim());
			}
			return factory.createAppliance(deviceName, deviceCharacteristics);
		}
		next = false;
		reader.close();
		return null;
	}
}
