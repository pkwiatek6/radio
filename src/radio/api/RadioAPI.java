package radio.api;

import java.util.ArrayList;
import radio.Radio;

public class RadioAPI {
	
	private ArrayList<Station> stations = new ArrayList<Station>();

	public RadioAPI(Radio plugin) {
		// TODO: Constructor code
	}
	
	public void createStation(String player) {
		Station station = new Station(player);
		System.out.println(station.getStationNumber());
		System.out.println();
	}
	
	public ArrayList<Station> getAllStations() {
		return stations;
	}
}