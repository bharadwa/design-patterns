package org.design.creational.singleton;

public class FileBasedConfigurationManagerImpl extends  FileBasedConfigurationManager{

    private static volatile FileBasedConfigurationManager instance;

    private FileBasedConfigurationManagerImpl () {
    }

    public static FileBasedConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (instance == null) {

                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    protected static void resetInstance() {
        instance =null;

    }
    @Override
    public String getConfiguration(String key) {
        if(key==null) {
            return null;
        }
        return outConvert(key,String.class);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        if(key==null){
            return null;
        }
        return outConvert(key,type);
    }

    @Override
    public void setConfiguration(String key, String value) {
         if(key==null||value==null) {
             return;
         }
         getProperties().put(key,value);

    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        if(key==null||value==null) {
            return;
        }
        getProperties().put(key,value);
    }

    @Override
    public void removeConfiguration(String key) {
        getProperties().remove(key);
    }

    @Override
    public void clear() {
        getProperties().clear();
    }
}
