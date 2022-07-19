package net.william278.huskchat.discord;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public enum DiscordMessageFormat {

    EMBEDDED("""
            {
              "avatar_url": "https://www.spigotmc.org/data/resource_icons/94/94496.jpg",
              "username": "HuskChat",
              "content": null,
              "embeds": [
                {
                  "description": "{CHAT_MESSAGE}",
                  "color": 64410,
                  "footer": {
                    "text": "{SENDER_USERNAME} • {SENDER_CHANNEL}",
                    "icon_url": "https://crafatar.com/avatars/{SENDER_UUID}?size=64"
                  },
                  "timestamp": "{CURRENT_TIMESTAMP}"
                }
              ]
            }"""),

    INLINE("""
            {
              "avatar_url": "https://crafatar.com/avatars/{SENDER_UUID}?size=128",
              "username": "[{SENDER_CHANNEL}] {SENDER_USERNAME}",
              "content": "{CHAT_MESSAGE}"
            }""");

    public final String postMessageFormat;

    DiscordMessageFormat(@NotNull String postMessageFormat) {
        this.postMessageFormat = postMessageFormat;
    }

    /**
     * Get the discord message format by name if it exists
     *
     * @param formatName The name of the message format
     * @return the {@link DiscordMessageFormat}
     */
    public static Optional<DiscordMessageFormat> getMessageFormat(@NotNull String formatName) {
        for (DiscordMessageFormat messageFormat : DiscordMessageFormat.values()) {
            if (messageFormat.name().equalsIgnoreCase(formatName)) {
                return Optional.of(messageFormat);
            }
        }
        return Optional.empty();
    }

}
