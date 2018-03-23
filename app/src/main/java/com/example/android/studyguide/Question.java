package com.example.android.studyguide;


public class Question {

    private int location;
    private int question;
    private int photoId;
    private boolean isTrue;

    public int getLocation() {return location;}

    public void setLocation(int location) {this.location = location;}

    public int getQuestion() {return question;}

    public void setQuestion(int question) {this.question = question;}

    public int getPhotoId() {return photoId;}

    public void setPhotoId(int photoId) {this.photoId = photoId;}

    public boolean isTrue() {return isTrue;}

    public void setTrue(boolean isTrue) {this.isTrue = isTrue;}

    public Question (int location, int question, int photoId, boolean isTrue) {

        this.location = location;
        this.question = question;
        this.photoId = photoId;
        this.isTrue = isTrue;
    }
}
