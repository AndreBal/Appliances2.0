package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Speakers implements Appliance {
	private Double powerConsumption;
	private Double numberOfSpeakers;
	private String frequencyRange;
	private Double cordLength;

	public Speakers(Double powerConsumption, Double numberOfSpeakers, String frequencyRange, Double cordLength) {
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cordLength == null) ? 0 : cordLength.hashCode());
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + ((numberOfSpeakers == null) ? 0 : numberOfSpeakers.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
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
		Speakers other = (Speakers) obj;
		if (cordLength == null) {
			if (other.cordLength != null)
				return false;
		} else if (!cordLength.equals(other.cordLength))
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (numberOfSpeakers == null) {
			if (other.numberOfSpeakers != null)
				return false;
		} else if (!numberOfSpeakers.equals(other.numberOfSpeakers))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		return true;
	}

	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public Double getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(Double numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public Double getCordLength() {
		return cordLength;
	}

	public void setCordLength(Double cordLength) {
		this.cordLength = cordLength;
	}
	
	@Override
	public Map<String, Object> getSearchableCriteria() {
		Map<String,Object> params = new HashMap<>();
		params.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(),  getPowerConsumption());
		params.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(),  getNumberOfSpeakers());
		params.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(),  getFrequencyRange());
		params.put(SearchCriteria.Speakers.CORD_LENGTH.toString(),  getCordLength());
		return params;
	}

}
