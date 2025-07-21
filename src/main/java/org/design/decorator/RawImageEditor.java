package org.design.decorator;

import org.design.decorator.utils.Image;
import org.design.decorator.utils.ImageUtils;

public class RawImageEditor implements  ImageEditor{
    @Override
    public Image readImage(String fileName) {
        return ImageUtils.read(fileName);
    }

}
