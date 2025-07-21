package org.design.decorator;

import org.design.decorator.utils.Image;
import org.design.decorator.utils.ImageUtils;

public class ImageManager {

    public static  void main(String args[]) {
        ImageManager manger =new ImageManager();
        manger.readImage("/test",true,true);
    }
    public Image readImage(String filePath, boolean enableGrayscale, boolean enableBlur) {
        ImageEditor imageEditor = new RawImageEditor();
        Image image = null;
        if (enableGrayscale) {
            imageEditor = new GrayScaleImageDecorator(imageEditor);
            image=imageEditor.readImage(filePath);
        }
        if( enableBlur) {
            imageEditor = new BlurImageDecorator(imageEditor);
            image=imageEditor.readImage(filePath);
        }
        return image;
    }
}
