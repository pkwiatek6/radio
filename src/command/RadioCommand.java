package command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import radio.api.RadioAPI;
import radio.api.Station;
import strings.Strings;

public class RadioCommand implements CommandExecutor {
	
	private RadioAPI api;
	private Station station;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (args.length == 0) {
			sender.sendMessage("No args.");
		}
		
		else if (args.length > 0) {
			if (args[0].equalsIgnoreCase("create")) {
				sender.sendMessage(Strings.PREFIX + "Create station?");
			}
		}
		
		return false;
	}
}
