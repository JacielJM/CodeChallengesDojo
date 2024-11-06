package com.jacieljm.solid.socialmedia;

public class Facebook extends SocialMedia{
    @Override
    public void chatWithFriend() {
        System.out.println("Initiating bubble chat...");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("New post published!");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Media file sent");
    }

    @Override
    public void groupVideoCall(String... users) {
        System.out.println("Starting video call");
    }
}
