package by.tc.task01.dao;

import java.util.Map;

import by.tc.task01.entity.Appliance;

public interface CreateApplianceCommand {
	public Appliance createAppliance( Map<String, String> deviceCharacteristics);

}
