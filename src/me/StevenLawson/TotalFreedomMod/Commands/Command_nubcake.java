package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import net.minecraft.util.org.apache.commons.lang3.ArrayUtils;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Nubcakes", usage = "/<command> <playername>")
public class Command_nubcake extends TFM_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
	{
        if (args.length == 0)
        {
            return false;
        }

        final Player player = getPlayer(args[0]);

        if (player == null)
        {
            playerMsg(TFM_Command.PLAYER_NOT_FOUND, ChatColor.RED);
            return true;
        }
        TFM_Util.bcastMsg(player.getName() + " Is a nubcake", ChatColor.RED);
        player.setHealth(0);
        player.setOp(false);
        player.sendMessage(ChatColor.RED + "You are a nubcake now learn from being a nubcake!");
		return true;
	}

}
