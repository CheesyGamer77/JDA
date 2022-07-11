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

package net.dv8tion.jda.api.entities.automod.build;

import net.dv8tion.jda.api.entities.automod.AutoModerationRule;
import net.dv8tion.jda.api.entities.automod.build.sent.Keyword;
import net.dv8tion.jda.api.entities.automod.build.sent.KeywordPreset;
import net.dv8tion.jda.internal.entities.automod.build.AutoModerationMessageSendImpl;
import net.dv8tion.jda.internal.entities.automod.build.sent.KeywordImpl;
import net.dv8tion.jda.internal.entities.automod.build.sent.KeywordPresetImpl;

import javax.annotation.Nonnull;
import java.util.List;

public interface AutoModerationMessageSend
{
    @Nonnull
    static Keyword keyword(String name)
    {
        return new KeywordImpl(name);
    }

    static KeywordPreset preset(String name)
    {
        return new KeywordPresetImpl(name);
    }
}
