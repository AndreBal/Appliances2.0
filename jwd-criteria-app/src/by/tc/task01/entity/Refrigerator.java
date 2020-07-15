package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator implements Appliance {
	private Double powerConsumption;
	private Double weight;
	private Double freezerCapacity;
	private Double overallCapacity;
	private Double height;
	private Double width;

	public Refrigerator(Double powerConsumption, Double weight, Double freezerCapacity, Double overallCapacity,
			Double height, Double width) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;

	}
	
	
	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((freezerCapacity == null) ? 0 : freezerCapacity.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((overallCapacity == null) ? 0 : overallCapacity.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity == null) {
			if (other.freezerCapacity != null)
				return false;
		} else if (!freezerCapacity.equals(other.freezerCapacity))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (overallCapacity == null) {
			if (other.overallCapacity != null)
				return false;
		} else if (!overallCapacity.equals(other.overallCapacity))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}


	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(Double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public Double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(Double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	@Override
	public Map<String, Object> getSearchableCriteria() {
		Map<String,Object> params = new HashMap<>();
		params.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(),  getPowerConsumption());
		params.put(SearchCriteria.Refrigerator.WEIGHT.toString(),  getWeight());
		params.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(),  getFreezerCapacity());
		params.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(),  getOverallCapacity());
		params.put(SearchCriteria.Refrigerator.HEIGHT.toString(),  getHeight());
		params.put(SearchCriteria.Refrigerator.WIDTH.toString(),  getWidth());
		return params;
	}
}
