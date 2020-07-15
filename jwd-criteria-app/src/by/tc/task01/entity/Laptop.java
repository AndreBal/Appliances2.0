package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop implements Appliance{
	private Double batteryCapacity;
	private String Os;
	private Double memoryRom;
	private Double SystemMemory;
	private Double Cpu;
	private Double DisplayInchs;
	
	public Laptop(Double batteryCapacity,String Os,Double memoryRom,Double SystemMemory,Double Cpu,Double DisplayInchs) {
		this.batteryCapacity = batteryCapacity;
		this.Os = Os;
		this.memoryRom = memoryRom;
		this.SystemMemory = SystemMemory;
		this.Cpu = Cpu;
		this.DisplayInchs = DisplayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cpu == null) ? 0 : Cpu.hashCode());
		result = prime * result + ((DisplayInchs == null) ? 0 : DisplayInchs.hashCode());
		result = prime * result + ((Os == null) ? 0 : Os.hashCode());
		result = prime * result + ((SystemMemory == null) ? 0 : SystemMemory.hashCode());
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (Cpu == null) {
			if (other.Cpu != null)
				return false;
		} else if (!Cpu.equals(other.Cpu))
			return false;
		if (DisplayInchs == null) {
			if (other.DisplayInchs != null)
				return false;
		} else if (!DisplayInchs.equals(other.DisplayInchs))
			return false;
		if (Os == null) {
			if (other.Os != null)
				return false;
		} else if (!Os.equals(other.Os))
			return false;
		if (SystemMemory == null) {
			if (other.SystemMemory != null)
				return false;
		} else if (!SystemMemory.equals(other.SystemMemory))
			return false;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", Os=" + Os + ", memoryRom=" + memoryRom
				+ ", SystemMemory=" + SystemMemory + ", Cpu=" + Cpu + ", DisplayInchs=" + DisplayInchs + "]";
	}

	public Double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return Os;
	}

	public void setOs(String os) {
		Os = os;
	}

	public Double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(Double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public Double getSystemMemory() {
		return SystemMemory;
	}

	public void setSystemMemory(Double systemMemory) {
		SystemMemory = systemMemory;
	}

	public Double getCpu() {
		return Cpu;
	}

	public void setCpu(Double cpu) {
		Cpu = cpu;
	}

	public Double getDisplayInchs() {
		return DisplayInchs;
	}

	public void setDisplayInchs(Double displayInchs) {
		DisplayInchs = displayInchs;
	}

	@Override
	public Map<String, Object> getSearchableCriteria() {
		Map<String,Object> params = new HashMap<>();
		params.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(),  getBatteryCapacity());
		params.put(SearchCriteria.Laptop.OS.toString(),  getOs());
		params.put(SearchCriteria.Laptop.MEMORY_ROM.toString(),  getMemoryRom());
		params.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(),  getSystemMemory());
		params.put(SearchCriteria.Laptop.CPU.toString(),  getCpu());
		params.put(SearchCriteria.Laptop.DISPLAY_INCHS.toString(),  getDisplayInchs());
		return params;
	}


}
