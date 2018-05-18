package com.example.tarun.singlechat;

public class ChatMessage {

    private String userName;
    private String text;
    private String imageUrl;
    private long timestamp;

    public ChatMessage(String userName, String text, String imageUrl) {
        this.userName = userName;
        this.text = text;
        this.imageUrl = imageUrl;
        this.timestamp = System.currentTimeMillis();
    }

    public ChatMessage() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
