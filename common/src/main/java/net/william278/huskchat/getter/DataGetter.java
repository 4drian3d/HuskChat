/*
 * This file is part of HuskChat, licensed under the Apache License 2.0.
 *
 *  Copyright (c) William278 <will27528@gmail.com>
 *  Copyright (c) contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.william278.huskchat.getter;

import net.william278.huskchat.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

/**
 * Used for fetching data about users from third party plugins
 */
public abstract class DataGetter {

    public abstract String getPlayerFullName(@NotNull Player player);

    public abstract String getPlayerName(@NotNull Player player);

    public abstract Optional<String> getPlayerPrefix(@NotNull Player player);

    public abstract Optional<String> getPlayerSuffix(@NotNull Player player);

    public abstract Optional<String> getPlayerGroupName(@NotNull Player player);

    public abstract Optional<String> getPlayerGroupDisplayName(@NotNull Player player);

    public abstract Optional<String> getTextFromNode(@NotNull Player player, @NotNull String nodePrefix);

}
