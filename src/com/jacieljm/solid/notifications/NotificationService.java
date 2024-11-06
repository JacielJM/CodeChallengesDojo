package com.jacieljm.solid.notifications;

import java.time.LocalDateTime;

public class NotificationService {
    public String sendOTP(OTPMedium medium) {
        return String.format(medium.sendOTP()+" on %s", LocalDateTime.now());
    }
}
