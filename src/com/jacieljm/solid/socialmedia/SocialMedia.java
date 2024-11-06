package com.jacieljm.solid.socialmedia;

public abstract class SocialMedia {
    public abstract  void chatWithFriend();

    public abstract void publishPost(Object post) throws NoSuchMethodException;

    public abstract  void sendPhotosAndVideos();

    public abstract  void groupVideoCall(String... users);

}
