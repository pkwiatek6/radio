package radio;

import org.bukkit.plugin.java.JavaPlugin;
import radio.api.RadioAPI;

import command.RadioCommand;

public class Radio extends JavaPlugin {
	
	private RadioAPI api;
	
	@Override
	public void onEnable() {
		getLogger().info("is now broadcasting.");
		
		getCommand("radio").setExecutor(new RadioCommand());
		getAPI();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("is ending broadcasting.");
	}
	
	public void getAPI() {
		api = new RadioAPI(this);
		api.getAllStations();
	}
}