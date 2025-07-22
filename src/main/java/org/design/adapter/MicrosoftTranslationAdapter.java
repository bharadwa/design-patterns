package org.design.adapter;

import org.design.adapter.external.MicrosoftTranslateApi;

import java.util.List;



public class MicrosoftTranslationAdapter implements TranslationProviderAdapter {

    private final MicrosoftTranslateApi microsoftTranslateApi;

    public MicrosoftTranslationAdapter(){
        microsoftTranslateApi=new MicrosoftTranslateApi();
    }

    @Override
    public List<String> getAllSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }

    @Override
    public String translateLanguage(TranslationRequest request) {
        return microsoftTranslateApi.translate(request.getText(), request.getSourceLanguage(),request.getTargetLanguage());
    }

}