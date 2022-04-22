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

package net.dv8tion.jda.api.entities.sticker;

import net.dv8tion.jda.api.entities.ISnowflake;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public interface StickerPack extends ISnowflake
{
    @Nonnull
    List<StandardSticker> getStickers();

    @Nonnull
    String getName();

    @Nonnull
    String getDescription();

    // TODO: URLs and Proxies

    long getCoverIdLong();

    @Nullable
    default String getCoverId()
    {
        long id = getCoverIdLong();
        return id == 0 ? null : Long.toUnsignedString(id);
    }

    long getBannerIdLong();

    @Nullable
    default String getBannerId()
    {
        long id = getBannerIdLong();
        return id == 0 ? null : Long.toUnsignedString(id);
    }

    long getSkuIdLong();

    @Nullable
    default String getSkuId()
    {
        long id = getSkuIdLong();
        return id == 0 ? null : Long.toUnsignedString(id);
    }
}
