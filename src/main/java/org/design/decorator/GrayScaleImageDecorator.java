package org.design.decorator;

import org.design.decorator.utils.Image;
import org.design.decorator.utils.ImageUtils;

public class GrayScaleImageDecorator extends BaseImageDecorator{

    public GrayScaleImageDecorator(ImageEditor imageEditor) {
        super(imageEditor);
    }

    @Override
    public Image readImage(String fileName) {
        Image image = imageEditor.readImage(fileName);
        return ImageUtils.convertToGrayscale(image);

    }


}
