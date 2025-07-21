package org.design.decorator;

import lombok.AllArgsConstructor;
import org.design.decorator.utils.Image;

@AllArgsConstructor
public abstract class BaseImageDecorator implements ImageEditor{

    protected ImageEditor imageEditor;

}
