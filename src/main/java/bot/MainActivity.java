package bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import javax.security.auth.login.LoginException;

public class MainActivity {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault(args[0])
                .setAutoReconnect(true)
                .setStatus(OnlineStatus.ONLINE)
                .build();
        jda.addEventListener(new MainListener());
    }
}