package org.design.creational.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class FileBasedConfigurationManager {
    protected final Properties properties;
    public FileBasedConfigurationManager() {
        this.properties = new Properties();
    }

    public void load(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Error while loading configuration file", e);
        }
    }

    public static FileBasedConfigurationManager getInstance() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected static void resetInstance() {

    }

    public abstract String getConfiguration(String key);

    public abstract <T> T getConfiguration(String key, Class<T> type);

    public abstract void setConfiguration(String key, String value);

    public abstract <T> void setConfiguration(String key, T value);

    public abstract void removeConfiguration(String key);

    public abstract void clear();

    protected Properties getProperties() {
        return properties;
    }

    protected <T> T convert(String value, Class<T> type) {
        System.out.println("Converting " + value + " to " + type.getSimpleName());
        if(type == String.class) {
            return type.cast(value);
        } else if(type == Integer.class) {
            return type.cast(Integer.valueOf(value));
        } else if(type == Boolean.class) {
            return type.cast(Boolean.valueOf(value));
        } else if(type == Double.class) {
            return type.cast(Double.valueOf(value));
        } else if(type == Long.class) {
            return type.cast(Long.valueOf(value));
        } else if(type == Float.class) {
            return type.cast(Float.valueOf(value));
        }
        throw new IllegalArgumentException("Unsupported type: " + type.getSimpleName());
    }

    protected <T> T outConvert (String key ,Class<T> type) {
        Object value=properties.get(key);
        if(value==null) {
            return null;
        }
        return convert(value.toString(), type);

    }
}
