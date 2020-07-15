package by.tc.task01.dao.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.dao.CreateApplianceCommand;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceFactoryImpl implements ApplianceFactory {

	private static final Map<String, CreateApplianceCommand> APPLIANCES;

	static {
		final Map<String, CreateApplianceCommand> appliances = new HashMap<String, CreateApplianceCommand>();

		appliances.put("Laptop", new CreateApplianceCommand() {
			@Override
			public Appliance createAppliance(Map<String, String> params) {
				Double batteryCapacity = Double.parseDouble(params.get("BATTERY_CAPACITY"));
				String Os = params.get("OS");
				Double memoryRom = Double.parseDouble(params.get("MEMORY_ROM"));
				Double SystemMemory = Double.parseDouble(params.get("SYSTEM_MEMORY"));
				Double Cpu = Double.parseDouble(params.get("CPU"));
				Double DisplayInchs = Double.parseDouble(params.get("DISPLAY_INCHS"));

				return new Laptop(batteryCapacity, Os, memoryRom, SystemMemory, Cpu, DisplayInchs);
			}
		});

		appliances.put("Oven", new CreateApplianceCommand() {
			@Override
			public Appliance createAppliance(Map<String, String> params) {
				Double powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
				Double weigth = Double.parseDouble(params.get("WEIGHT"));
				Double capacity = Double.parseDouble(params.get("CAPACITY"));
				Double depth = Double.parseDouble(params.get("DEPTH"));
				Double height = Double.parseDouble(params.get("HEIGHT"));
				Double width = Double.parseDouble(params.get("WIDTH"));

				return new Oven(powerConsumption, weigth, capacity, depth, height, width);
			}
		});

		appliances.put("Refrigerator", new CreateApplianceCommand() {
			@Override
			public Appliance createAppliance(Map<String, String> params) {
				Double powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
				Double weight = Double.parseDouble(params.get("WEIGHT"));
				Double freezerCapacity = Double.parseDouble(params.get("FREEZER_CAPACITY"));
				Double overallCapacity = Double.parseDouble(params.get("OVERALL_CAPACITY"));
				Double height = Double.parseDouble(params.get("HEIGHT"));
				Double width = Double.parseDouble(params.get("WIDTH"));

				return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
			}
		});

		appliances.put("Speakers", new CreateApplianceCommand() {
			@Override
			public Appliance createAppliance(Map<String, String> params) {
				Double powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
				Double numberOfSpeakers = Double.parseDouble(params.get("NUMBER_OF_SPEAKERS"));
				String frequencyRange = params.get("FREQUENCY_RANGE");
				Double cordLength = Double.parseDouble(params.get("CORD_LENGTH"));

				return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
			}
		});

		appliances.put("TabletPC", new CreateApplianceCommand() {
			@Override
			public Appliance createAppliance(Map<String, String> params) {
				Double batteryCapacity = Double.parseDouble(params.get("BATTERY_CAPACITY"));
				Double displayInches = Double.parseDouble(params.get("DISPLAY_INCHES"));
				Double memoryRom = Double.parseDouble(params.get("MEMORY_ROM"));
				Double flashMemoryCapacity = Double.parseDouble(params.get("FLASH_MEMORY_CAPACITY"));
				String blue = params.get("COLOR");

				return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, blue);
			}
		});

		appliances.put("VacuumCleaner", new CreateApplianceCommand() {
			@Override
			public Appliance createAppliance(Map<String, String> params) {
				Double powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
				String filterType = params.get("FILTER_TYPE");
				String bagType = params.get("BAG_TYPE");
				String wandType = params.get("WAND_TYPE");
				Double motorSpeedRegulation = Double.parseDouble(params.get("MOTOR_SPEED_REGULATION"));
				Double cleaningWidth = Double.parseDouble(params.get("CLEANING_WIDTH"));

				return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation,
						cleaningWidth);
			}
		});

		APPLIANCES = Collections.unmodifiableMap(appliances);
	}

	public Appliance createAppliance(String deviceName, Map<String, String> deviceCharacteristics) {
		CreateApplianceCommand command = APPLIANCES.get(deviceName);
		return command.createAppliance(deviceCharacteristics);
	}

}
