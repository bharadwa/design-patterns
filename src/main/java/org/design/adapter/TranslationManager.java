package org.design.adapter;

public class TranslationManager {

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
        return TranslationFactory.getAdapter(provider).translateLanguage(TranslationRequest.from(text, sourceLanguage, targetLanguage));
    }

}
