package by.tc.task01.main;

import java.util.Map;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		String deviceName = appliance.getClass().getName();
		Map<String,Object> params = appliance.getSearchableCriteria();
		System.out.println(deviceName + " was found.");
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			System.out.println("It's " + entry.getKey() + " equals " + entry.getValue());
		}
		System.out.println();
	}
	
	// you may add your own code here

}
