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

package net.dv8tion.jda.api.entities;

/**
 * Represents the type of trigger that can cause an auto moderation rule to be executed.
 */
public enum TriggerType
{
    /**
     * Checks if the content sent by a member contains a specific word.
     * <br>
     * The max per guild is 3.
     */
    KEYWORD(1, 3),
    /**
     * Checks for any harmful links.
     *
     * This is not released yet.
     * <br>
     * The max per guild is 1.
     */
    HARMFUL_LINK(2, 1),
    /**
     * Checks for generic spam.
     *
     * This is not released yet.
     * <br>
     * The max per guild is 1.
     */
    SPAM(3, 1),
    /**
     * Checks if the content contains words from internally pre-defined word sets.
     *
     * <br>
     * The max per guild is 1.
     */
    KEYWORD_PRESET(4, 1),
    /**
     * An unknown trigger type.
     */
    UNKNOWN(-1, 0);

    private final int value;
    private final int maxPerGuild;

    TriggerType(int value, int maxPerGuild) {
        this.value = value;
        this.maxPerGuild = maxPerGuild;
    }

    public int getValue() {
        return value;
    }

    public int getMaxPerGuild() {
        return maxPerGuild;
    }

    public static TriggerType fromValue(int value) {
        for (TriggerType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
