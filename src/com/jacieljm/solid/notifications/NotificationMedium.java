package com.jacieljm.solid.notifications;

public class NotificationMedium {
    public static final OTPMedium email = () -> "\nEmail sent successfully";
    public static final OTPMedium sms = () -> "\nSMS sent successfully";
    public static final OTPMedium push = () -> "\nNew push notification sent successfully";
}
