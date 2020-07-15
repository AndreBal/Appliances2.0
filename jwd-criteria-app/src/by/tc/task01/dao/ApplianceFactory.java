package by.tc.task01.dao;

import java.util.Map;

import by.tc.task01.entity.Appliance;

public interface ApplianceFactory {
	public Appliance createAppliance(String deviceName, Map<String, String> deviceCharacteristics);

}
