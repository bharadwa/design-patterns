package org.design.decorator.utils;

public class ImageUtils {

    public static Image read(String filePath) {
        return new Image(filePath);
    }

    public static Image convertToGrayscale(Image image) {
        System.out.println("Converting image to grayscale: " + image.getFilePath());
        return image;
    }

    public static Image applyBlur(Image image) {
        System.out.println("applying blur to image: " + image.getFilePath());
        return image;
    }

    public static void render(Image image) {
        System.out.println("Rendering image: " + image.getFilePath());
    }
}
