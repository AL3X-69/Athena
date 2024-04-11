package dev.alex6.athena.potato;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getenv());
        JDA jda = JDABuilder.createDefault(System.getenv("DISCORD_TOKEN"))
                .build();

        jda.updateCommands()
                .addCommands(Commands.slash("potato", "Send a query to the Athena environment"))
                .queue();
    }
}
