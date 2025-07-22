package org.design.adapter;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@NoArgsConstructor
@Setter
@Getter
public class TranslationRequest {

    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;

    public static TranslationRequest from(String text,String sourceLanguage,String confidenceThreshold){
        TranslationRequest request =new TranslationRequest();
        request.setText(text);
        request.setSourceLanguage(sourceLanguage);
        request.setTargetLanguage(confidenceThreshold);
        return request;
    }
}
