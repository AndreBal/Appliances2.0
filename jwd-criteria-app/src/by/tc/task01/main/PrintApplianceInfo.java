package by.tc.task01.main;

import java.util.List;
import java.util.Map;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> applianceList) {
		if (applianceList.size() == 0) {
			System.out.println("No appliances was found");
		} else {
			for (Appliance appliance : applianceList) {
				String deviceName = appliance.getClass().getSimpleName();
				Map<String, Object> params = appliance.getSearchableCriteria();
				System.out.println(deviceName + " was found.");
				for (Map.Entry<String, Object> entry : params.entrySet()) {
					System.out.println("It's " + entry.getKey() + " equals " + entry.getValue());
				}
				System.out.println();
			}
		}

		// you may add your own code here

	}
}
