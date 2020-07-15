package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPC implements Appliance {
	private Double batteryCapacity;
	private Double displayInches;
	private Double memoryRom;
	private Double flashMemoryCapacity;
	private String blue;

	public TabletPC(Double batteryCapacity, Double displayInches, Double memoryRom, Double flashMemoryCapacity,
			String blue) {
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.blue = blue;
	}

	
	
	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", blue=" + blue + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((blue == null) ? 0 : blue.hashCode());
		result = prime * result + ((displayInches == null) ? 0 : displayInches.hashCode());
		result = prime * result + ((flashMemoryCapacity == null) ? 0 : flashMemoryCapacity.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (blue == null) {
			if (other.blue != null)
				return false;
		} else if (!blue.equals(other.blue))
			return false;
		if (displayInches == null) {
			if (other.displayInches != null)
				return false;
		} else if (!displayInches.equals(other.displayInches))
			return false;
		if (flashMemoryCapacity == null) {
			if (other.flashMemoryCapacity != null)
				return false;
		} else if (!flashMemoryCapacity.equals(other.flashMemoryCapacity))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		return true;
	}



	public Double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(Double displayInches) {
		this.displayInches = displayInches;
	}

	public Double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(Double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public Double getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(Double flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getBlue() {
		return blue;
	}

	public void setBlue(String blue) {
		this.blue = blue;
	}
	
	@Override
	public Map<String, Object> getSearchableCriteria() {
		Map<String,Object> params = new HashMap<>();
		params.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(),  getBatteryCapacity());
		params.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(),  getDisplayInches());
		params.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(),  getMemoryRom());
		params.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(),  getFlashMemoryCapacity());
		params.put(SearchCriteria.TabletPC.COLOR.toString(),  getBlue());
		return params;
	}
	
}
