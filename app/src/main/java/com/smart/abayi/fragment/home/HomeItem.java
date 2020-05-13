package com.smart.abayi.fragment.home;

public class HomeItem {

    private String urlImage;
    private String title;
    private String data;
    private int countComment;
    private String newsId;

    public HomeItem (String url, String mtitle, String mdata, int mcountComment, String mnewsId){
        urlImage = url;
        title = mtitle;
        data = mdata;
        countComment = mcountComment;
        newsId = mnewsId;
    }

    public String getUrlImage(){
        return urlImage;
    }

    public String getTitle(){
        return title;
    }

    public String getData(){
        return data;
    }

    public int getCountComment(){
        return countComment;
    }

    public String getNewsId(){
        return newsId;
    }
}

