package com.jacieljm.solid.socialmedia;

public class WhatsApp extends SocialMedia {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }


    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
