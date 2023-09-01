package org.rohit.controller;

import org.rohit.dto.Notification;
import org.rohit.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notify")
    public ResponseEntity<String> sendNotification(@RequestHeader("Authorization") String token,
                                                   @RequestBody Notification notification) {

        boolean isTokenValid = notificationService.validateToken(token);

        if (!isTokenValid) {
            return ResponseEntity.status(401).body("Unauthorized");
        }

        notificationService.sendEmail(notification.getEmail(), notification.getMessage());
        return ResponseEntity.ok("Notification sent successfully");
    }
}
