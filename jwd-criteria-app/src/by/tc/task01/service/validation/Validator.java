package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		Map<String, Object> validationCriteria = criteria.getCriteria();
		for (Map.Entry<String, Object> entry : validationCriteria.entrySet()) {
			if (!validation(entry.getKey(), entry.getValue())) {
				return false;
			}
		}
		return true;
	}

	private static boolean validation(String param, Object Value) {
		switch (param) {
		case "POWER_CONSUMPTION":
		case "WEIGHT":
		case "CAPACITY":
		case "DEPTH":
		case "HEIGHT":
		case "WIDTH":
		case "BATTERY_CAPACITY":
		case "MEMORY_ROM":
		case "SYSTEM_MEMORY":
		case "CPU":
		case "DISPLAY_INCHS":
		case "FREEZER_CAPACITY":
		case "OVERALL_CAPACITYY":
		case "MOTOR_SPEED_REGULATION":
		case "CLEANING_WIDTH":
		case "DISPLAY_INCHES":
		case "FLASH_MEMORY_CAPACITY":
		case "NUMBER_OF_SPEAKERS":
		case "CORD_LENGTH":
			if (Value != null && ((Integer) Value)*1.0 > 0.0) {
				return true;
			}

		case "OS":
		case "FILTER_TYPE":
		case "BAG_TYPE":
		case "WAND_TYPE":
		case "COLOR":
		case "FREQUENCY_RANGE":
			if (Value != null) {
				return true;
			}

		default:
			return false;
		}
	}

}