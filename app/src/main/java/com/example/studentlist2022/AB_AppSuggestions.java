package com.example.studentlist2022;

public class AB_AppSuggestions {
    String ab_AppName;
    String ab_AppDetails;
    String ab_MoreInfo;
    int ab_ImageInfo;

    public AB_AppSuggestions(String ab_AppName, String ab_AppDetails, String ab_appMoreInfo, int ab_ImageInfo){
        this.ab_AppName = ab_AppName;
        this.ab_AppDetails = ab_AppDetails;
        this.ab_MoreInfo = ab_appMoreInfo;
        this.ab_ImageInfo = ab_ImageInfo;
    }

    public String getAB_AppName(){
        return ab_AppName;
    }

    public String getAB_AppDetails(){
        return ab_AppDetails;
    }

    public String getAB_MoreInfo(){
        return ab_MoreInfo;
    }

    public  int getAB_ImageInfo(){
        return ab_ImageInfo;
    }
}
