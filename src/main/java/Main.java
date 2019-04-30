import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main{

    private static JDA jda;

    public static void main(String[] args) throws Exception{
        jda  = new JDABuilder(AccountType.BOT)
                .setToken("NTY4NjU5NDAzNDgyMzMzMTg0.XLlT3A.-2enB2Z2nxvtU8x4SyCbUZtVXbQ")
                .build();

        jda.addEventListener(new Hello());
    }
}
