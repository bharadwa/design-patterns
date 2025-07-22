package org.design.adapter.external;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.design.adapter.TranslationRequest;

@AllArgsConstructor
@Getter
public class GoogleTranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;

    public static GoogleTranslationRequest from(TranslationRequest request) {
        return new GoogleTranslationRequest(request.getText(),request.getSourceLanguage(),request.getTargetLanguage(),request.getConfidenceThreshold());
    }
}