package com.example.sw221103;

public class ChatDTO {
    private String userName;
    private String message;
    private String imageUrl;
    private String link="";


    public ChatDTO() {}

    public ChatDTO(String userName, String message) {
        this.userName = userName;
        this.message = message;

    }

    public ChatDTO(String userName, String message, String imageUrl,String link) {
        this.userName = userName;
        this.message = message;
        this.imageUrl = imageUrl;
        this.link = link;

    }


    public String getLink() {
        return link != null ? link : "";
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
