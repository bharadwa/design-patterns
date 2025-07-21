package org.design.decorator;

import org.design.decorator.utils.Image;
import org.design.decorator.utils.ImageUtils;

public class BlurImageDecorator extends  BaseImageDecorator {

    public BlurImageDecorator(ImageEditor imageEditor) {
        super(imageEditor);
    }

    @Override
    public Image readImage(String fileName) {
        Image image = imageEditor.readImage(fileName);
        return ImageUtils.applyBlur(image);
    }

}
