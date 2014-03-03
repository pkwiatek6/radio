package radio.api;

import java.util.Random;

public class Station {
	
	private String player = "";
	private int primary = 0, secondary = 0;

	public Station(String player) {
		this.player = player;
		
		Random rand = new Random();
		primary = rand.nextInt(49) + 50;
		secondary = rand.nextInt(8) + 1;
	}
	
	public String getStationNumber() {
		return primary + "." + secondary;
	}
	
	public String getStationCreator() {
		return player;
	}
}
