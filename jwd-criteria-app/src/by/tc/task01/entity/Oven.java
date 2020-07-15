package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven implements Appliance {
	private Double powerConsumption;
	private Double weigth;
	private Double capacity;
	private Double depth;
	private Double height;
	private Double width;

	public Oven(Double powerConsumption, Double weigth, Double capacity, Double depth, Double height, Double width) {
		this.powerConsumption = powerConsumption;
		this.weigth = weigth;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weigth=" + weigth + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + ((depth == null) ? 0 : depth.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
		result = prime * result + ((weigth == null) ? 0 : weigth.hashCode());
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
		Oven other = (Oven) obj;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (depth == null) {
			if (other.depth != null)
				return false;
		} else if (!depth.equals(other.depth))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		if (weigth == null) {
			if (other.weigth != null)
				return false;
		} else if (!weigth.equals(other.weigth))
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

	public Double getWeigth() {
		return weigth;
	}

	public void setWeigth(Double weigth) {
		this.weigth = weigth;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
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
		params.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(),  getPowerConsumption());
		params.put(SearchCriteria.Oven.WEIGHT.toString(),  getWeigth());
		params.put(SearchCriteria.Oven.CAPACITY.toString(),  getCapacity());
		params.put(SearchCriteria.Oven.DEPTH.toString(),  getDepth());
		params.put(SearchCriteria.Oven.HEIGHT.toString(),  getHeight());
		params.put(SearchCriteria.Oven.WIDTH.toString(),  getWidth());
		return params;
	}

}
