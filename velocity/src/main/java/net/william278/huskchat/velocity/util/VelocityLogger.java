package net.william278.huskchat.velocity.util;

import net.william278.huskchat.util.Logger;

import java.util.logging.Level;

public class VelocityLogger implements Logger {

    private org.slf4j.Logger parent;

    private VelocityLogger() {
    }

    private static VelocityLogger instance;

    public static VelocityLogger get(org.slf4j.Logger parent) {
        if (instance == null) {
            instance = new VelocityLogger();
            instance.parent = parent;
        }
        return instance;
    }

    @Override
    public void log(Level level, String message, Exception e) {
        logMessage(level, message);
        e.printStackTrace();
    }

    @Override
    public void log(Level level, String message) {
        logMessage(level, message);
    }

    @Override
    public void info(String message) {
        logMessage(Level.INFO, message);
    }

    @Override
    public void severe(String message) {
        logMessage(Level.SEVERE, message);
    }

    @Override
    public void config(String message) {
        logMessage(Level.CONFIG, message);
    }

    // Logs the message using SLF4J
    private void logMessage(Level level, String message) {
        switch (level.intValue()) {
            case 1000 -> parent.error(message); // Severe
            case 900 -> parent.warn(message); // Warning
            case 70 -> parent.warn("[Config] " + message);
            default -> parent.info(message);
        }
    }
}