import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;


public class Hello extends ListenerAdapter{

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("-ping")){
            if(!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage( "Hello " + event.getMember().getNickname() + "!").queue();
            }
        }
        else if(args[0].equalsIgnoreCase("-Members")){
            if(!event.getMember().getUser().isBot()) {
                for(int i = 0; i < (event.getGuild().getMembers().size()) ; i++){
                    if(i == event.getGuild().getMembers().size()-1){
                        event.getChannel().sendMessage("There are " + i + " members in this server.").queue();}
                    }
                }
            }
        else if(args[0].equalsIgnoreCase("-info")){
            if(!event.getMember().getUser().isBot()) {
                if(args[1].equalsIgnoreCase("AK-47")){
                    event.getChannel().sendMessage( "`AK-47\n  Damage: 26" + "\n  RPS: 6" +
                            "\n  Ammo Capacity: 25\n  Reload Speed: 3 seconds" +
                            "\n  Minimum Price: 2000\n  Recommended Price Range: 2500-4000`").queue();

                }
                else if(args[1].equalsIgnoreCase("M4")){
                    event.getChannel().sendMessage( "`M4\n  Damage: 25" + "\n  RPS: 8" +
                            "\n  Ammo Capacity: 26\n  Reload Speed: 3 seconds" +
                            "\n  Minimum Price: 5000\n  Recommended Price Range: 6000-7000`").queue();
                }
                else if(args[1].equalsIgnoreCase("M16")){
                    event.getChannel().sendMessage( "`M16\n  Damage: 30" + "\n  RPS:2" +
                            "\n  Ammo Capacity: 25" + "\n  Reload Speed: 3 seconds" +
                            "\n  Minimum Price: 1500" + "\n  Recommended Price Range: 2500-3500`").queue();
                }
                else if(args[1].equalsIgnoreCase("M1911")){
                    event.getChannel().sendMessage( "`M1911\n  Damage: 24" + "\n  RPS:2" +
                            "\n  Ammo Capacity: 8" + "\n  Reload Speed: 2 seconds" +
                            "\n  Minimum Price: 300" + "\n  Recommended Price Range: 350-500`").queue();
                }
                else if(args[1].equalsIgnoreCase("Tec-9")){
                    event.getChannel().sendMessage( "`Tec-9\n  Damage: 18" + "\n  RPS:Unknown" +
                            "\n  Ammo Capacity: 16" + "\n  Reload Speed: Unknown" +
                            "\n  Minimum Price: 2800" + "\n  Recommended Price Range: 4000-6000`").queue();
                }
                else if(args[1].equalsIgnoreCase("USP")) {
                    event.getChannel().sendMessage("`USP\n  Damage: 26" + "\n  RPS:Unknown" +
                            "\n  Ammo Capacity: 8" + "\n  Reload Speed: Unknown" +
                            "\n  Minimum Price: 2800" + "\n  Recommended Price Range: 4000-6000`").queue();
                }
                else if(args[1].equalsIgnoreCase("XM8")) {
                    event.getChannel().sendMessage("`XM8\n  Damage: 30" + "\n  RPS:Unknown" +
                            "\n  Ammo Capacity: 20" + "\n  Reload Speed: Unknown" +
                            "\n  Minimum Price: 6000" + "\n  Recommended Price Range: 7000-12000`").queue();
                }
                else if(args[1].equalsIgnoreCase("Snubnose")) {
                    event.getChannel().sendMessage("`Snubnose\n  Damage: 30" + "\n  RPS:Unknown" +
                            "\n  Ammo Capacity: 6" + "\n  Reload Speed: Unknown" +
                            "\n  Minimum Price: 2150" + "\n  Recommended Price Range: 2500-3500`").queue();
                }
                else if(args[1].equalsIgnoreCase("Mauser")) {
                    event.getChannel().sendMessage("`Mauser\n  Damage: 18" + "\n  RPS:Unknown" +
                            "\n  Ammo Capacity: 12" + "\n  Reload Speed: Unknown" +
                            "\n  Minimum Price: 2800" + "\n  Recommended Price Range: 3000-5000`").queue();
                }
            }
        }

    }
}
