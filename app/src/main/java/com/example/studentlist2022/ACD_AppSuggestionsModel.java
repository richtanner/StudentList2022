package com.example.studentlist2022;

public class ACD_AppSuggestionsModel {
    String AD_appSuggestionName;
    String AD_appSuggestionDetails;
    String AD_appSuggestionMoreInfo;
    int AD_infoImage;

    public ACD_AppSuggestionsModel(String AD_appSuggestionName, String AD_appSuggestionDetails, String AD_appSuggestionMoreDetails, int AD_infoImage) {
        this.AD_appSuggestionName = AD_appSuggestionName;
        this.AD_appSuggestionDetails = AD_appSuggestionDetails;
        this.AD_infoImage = AD_infoImage;
        this.AD_appSuggestionMoreInfo = AD_appSuggestionMoreDetails;
    }

    public String getAD_appSuggestionName() {
        return AD_appSuggestionName;
    }

    public String getAD_appSuggestionDetails() {
        return AD_appSuggestionDetails;
    }
    public String getAD_appSuggestionMoreInfo(){return AD_appSuggestionMoreInfo;}
    public int getAD_infoImage() {
        return AD_infoImage;
    }
}
