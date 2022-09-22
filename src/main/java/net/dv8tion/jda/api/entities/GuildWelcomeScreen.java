package net.dv8tion.jda.api.entities;

import net.dv8tion.jda.api.JDA;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

/**
 * Represents a welcome screen belonging to a particular {@link net.dv8tion.jda.api.entities.Guild Guild}.
 */
public interface GuildWelcomeScreen
{
    /**
     * Returns the description shown from within the welcome screen.
     *
     * @return The description.
     */
    @Nullable
    @CheckReturnValue
    String getDescription();

    /**
     * Returns the {@link Channel Channels} shown in the welcome screen.
     *
     * @return The list of channels.
     */
    @Nonnull
    @CheckReturnValue
    List<Channel> getWelcomeChannels();

    /**
     * Returns the {@link net.dv8tion.jda.api.JDA JDA} instance of this GuildWelcomeScreen.
     *
     * @return the corresponding JDA instance
     */
    JDA getJDA();

    /**
     * Returns the {@link net.dv8tion.jda.api.entities.Guild Guild} that this welcome screen belongs to.
     *
     * @return The {@link net.dv8tion.jda.api.entities.Guild Guild} that owns this welcome screen.
     */
    @Nonnull
    @CheckReturnValue
    Guild getGuild();

    /**
     * Represents a Guild Welcome Screen Channel.
     * TODO: Implement emoji stuff
     */
    class Channel
    {
        private final String id;
        private final String description;

        public Channel(long id, String description)
        {
            this.id = Long.toUnsignedString(id);
            this.description = description;
        }

        /**
         * Returns the id of this welcome screen channel.
         * @return The id of the channel.
         */
        @Nonnull
        @CheckReturnValue
        public String getId()
        {
            return this.id;
        }

        /**
         * Returns the description of this welcome screen channel.
         * @return The description of the channel.
         */
        @Nonnull
        @CheckReturnValue
        public String getDescription()
        {
            return this.description;
        }
    }
}
