package org.design.decorator.filestorage.decorator;

import org.design.decorator.filestorage.FileStorage;

public abstract class BaseFileDecorator implements FileStorage {

    protected final FileStorage fileStorage;

    public BaseFileDecorator(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

}
