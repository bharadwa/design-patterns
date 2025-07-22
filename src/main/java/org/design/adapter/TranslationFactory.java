package org.design.adapter;

public class TranslationFactory {


    public static TranslationProviderAdapter getAdapter(String provider) {

        if (provider == null) {
            throw new RuntimeException("Invalid provider");
        }

        if (provider.equals("google")) {
            return new GoogleTranslationAdapter();
        } else if (provider.equals("microsoft")) {
            return new MicrosoftTranslationAdapter();
        } else {
            throw new RuntimeException("Invalid provider");
        }
    }

}
