package org.design.adapter;


import java.util.List;

public interface TranslationProviderAdapter {

    public List<String> getAllSupportedLanguages();

    public String translateLanguage(TranslationRequest request);
}
