package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleaner implements Appliance {
	private Double powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private Double motorSpeedRegulation;
	private Double cleaningWidth;

	public VacuumCleaner(Double powerConsumption, String filterType, String bagType, String wandType,
			Double motorSpeedRegulation, Double cleaningWidth) {
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	
	
	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + ((cleaningWidth == null) ? 0 : cleaningWidth.hashCode());
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + ((motorSpeedRegulation == null) ? 0 : motorSpeedRegulation.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth == null) {
			if (other.cleaningWidth != null)
				return false;
		} else if (!cleaningWidth.equals(other.cleaningWidth))
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedRegulation == null) {
			if (other.motorSpeedRegulation != null)
				return false;
		} else if (!motorSpeedRegulation.equals(other.motorSpeedRegulation))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}



	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public Double getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(Double motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public Double getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(Double cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	
	@Override
	public Map<String, Object> getSearchableCriteria() {
		Map<String,Object> params = new HashMap<>();
		params.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(),  getPowerConsumption());
		params.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(),  getFilterType());
		params.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(),  getBagType());
		params.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(),  getWandType());
		params.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(),  getMotorSpeedRegulation());
		params.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(),  getCleaningWidth());
		return params;
	}
	
}
