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
import net.dv8tion.jda.api.entities.automod.AutoModerationField;
import net.dv8tion.jda.api.entities.automod.AutoModerationRule;
import net.dv8tion.jda.api.entities.automod.TriggerMetadata;

import javax.annotation.Nonnull;

/**
 * Indicates that a {@link AutoModerationRule rule} updated its trigger metadata.
 *
 * <p>Can be used to retrieve the old trigger metadata.
 *
 * <p>Identifier: {@link AutoModerationField#TRIGGER_METADATA}
 */
public class AutoModerationRuleUpdateTriggerMetadataEvent extends GenericAutoModerationUpdateRuleEvent<TriggerMetadata>
{
    public AutoModerationRuleUpdateTriggerMetadataEvent(@Nonnull JDA api, long responseNumber, AutoModerationRule rule, AutoModerationField field, TriggerMetadata oldValue, TriggerMetadata newValue)
    {
        super(api, responseNumber, rule, field, oldValue, newValue);
    }

    /**
     * Returns the old trigger metadata.
     *
     * @return The old trigger metadata.
     */
    public TriggerMetadata getOldTriggerMetadata()
    {
        return getOldValue();
    }

    /**
     * Returns the new trigger metadata.
     *
     * @return The new trigger metadata.
     */
    public TriggerMetadata getNewTriggerMetadata()
    {
        return getNewValue();
    }
}
