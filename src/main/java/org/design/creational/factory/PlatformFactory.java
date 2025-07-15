package org.design.creational.factory;

public class PlatformFactory {


    public static Platform getPlatform(String platformType) {
        if (platformType == null || platformType.isEmpty()) {
            return null;
        }
        switch (platformType.toLowerCase()) {
            case "android":
                return new AndroidPlatForm();
            case "ios":
                return new IOSPlatform();
            case "windows":
                return new WindowsPlatform();
            default:
                throw new IllegalArgumentException("Unknown platform type: " + platformType);
        }
    }
}
