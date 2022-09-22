package net.dv8tion.jda.internal.entities;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.GuildWelcomeScreen;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class GuildWelcomeScreenImpl implements GuildWelcomeScreen
{
    private final JDA api;
    private final Guild guild;
    private final String description;
    private final List<GuildWelcomeScreen.Channel> welcomeChannels;

    public GuildWelcomeScreenImpl(Guild guild, String description, List<GuildWelcomeScreen.Channel> welcomeChannels) {
        this.api = guild.getJDA();
        this.guild = guild;
        this.description = description;
        this.welcomeChannels = welcomeChannels;
    }

    @Nullable
    @Override
    public String getDescription()
    {
        return this.description;
    }

    @Nonnull
    @Override
    public List<GuildWelcomeScreen.Channel> getWelcomeChannels()
    {
        return this.welcomeChannels;
    }

    @Nonnull
    @Override
    public JDA getJDA()
    {
        return this.api;
    }

    @Nonnull
    @Override
    public Guild getGuild()
    {
        return this.guild;
    }

    @Override
    public String toString() { return "GWS:" + getGuild(); }
}
