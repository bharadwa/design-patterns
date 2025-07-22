package org.design.adapter;


import org.design.adapter.external.GoogleTranslateApi;
import org.design.adapter.external.GoogleTranslationRequest;

import java.util.List;


public class GoogleTranslationAdapter implements TranslationProviderAdapter{

    private GoogleTranslateApi googleTranslateApi;

    public GoogleTranslationAdapter(){
        googleTranslateApi=new GoogleTranslateApi();
    }

    @Override
    public List<String> getAllSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }

    @Override
    public String translateLanguage(TranslationRequest request) {
        return googleTranslateApi.convert(GoogleTranslationRequest.from(request));
    }





}
