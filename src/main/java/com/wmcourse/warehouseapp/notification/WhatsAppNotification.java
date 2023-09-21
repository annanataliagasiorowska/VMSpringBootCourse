package com.wmcourse.warehouseapp.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
//@Profile("dev")
public class WhatsAppNotification implements NotificationService {
    @Override
    public String sendNotification() {
        return "This is notification via WhatsApp";
    }
}
