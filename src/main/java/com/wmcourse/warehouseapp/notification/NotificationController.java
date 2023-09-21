package com.wmcourse.warehouseapp.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Slf4j
@Controller
public class NotificationController {
    private final List<NotificationService> notificationServiceList;
    @Autowired
    public NotificationController(List<NotificationService> notificationServices) {
        this.notificationServiceList = notificationServices;
    }

    public void sendNotifications() {
        for (NotificationService service : notificationServiceList) {
            service.sendNotification();
        }
    }
}
