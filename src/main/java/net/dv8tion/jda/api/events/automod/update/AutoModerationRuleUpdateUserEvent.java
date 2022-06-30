/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.events.automod.update;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.automod.AutoModerationField;
import net.dv8tion.jda.api.entities.automod.AutoModerationRule;

import javax.annotation.Nonnull;

/**
 * Indicates that the creator(user) of a {@link AutoModerationRule rule} was updated.
 *
 * <p>Can be used to retrieve the old creator(user).
 *
 * <p>Identifier: {@link AutoModerationField#USER}
 */
public class AutoModerationRuleUpdateUserEvent extends GenericAutoModerationUpdateRuleEvent<User>
{
    public AutoModerationRuleUpdateUserEvent(@Nonnull JDA api, long responseNumber, AutoModerationRule rule, AutoModerationField field, User oldValue, User newValue)
    {
        super(api, responseNumber, rule, field, oldValue, newValue);
    }

    /**
     * Returns the old values of the creator(user).
     *
     * @return The old values of the creator(user).
     */
    public User getOldUser()
    {
        return getOldValue();
    }

    /**
     * Returns the new values of the creator(user).
     *
     * @return The new values of the creator(user).
     */
    public User getNewUser()
    {
        return getNewValue();
    }
}
