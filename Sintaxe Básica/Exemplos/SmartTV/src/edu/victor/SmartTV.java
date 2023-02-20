package edu.victor;

import java.util.Objects;

public class SmartTV {
	
	//Variables
	private boolean isOn;
	private int channel;
	private int volume;
	
	//Constructors
	public SmartTV() {
		isOn = true;
		channel = 10;
		volume = 14;
	}

	public SmartTV(boolean isOn, int channel, int volume) {
		this.isOn = isOn;
		this.channel = channel;
		this.volume = volume;
	}
	
	//Getters
	public boolean isOn() {
		return isOn;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
	
	//Methods
	public void turnOnOrOff() {
		isOn = !isOn;
	}
	
	public void increaseVolume() {
		volume++;
	}
	
	public void decreaseVolume() {
		volume--;
	}
	
	public void increaseChannel() {
		channel++;
	}
	
	public void decreaseChannel() {
		channel--;
	}
	
	public void changeChannel(int channel) {
		this.channel = channel;
	}

	//toString
	@Override
	public String toString() {
		return "SmartTV [isOn=" + isOn + ", channel=" + channel + ", volume=" + volume + "]";
	}
	
	//hashCode and Equals
	@Override
	public int hashCode() {
		return Objects.hash(channel, isOn, volume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartTV other = (SmartTV) obj;
		return channel == other.channel && isOn == other.isOn && volume == other.volume;
	}
	
}
