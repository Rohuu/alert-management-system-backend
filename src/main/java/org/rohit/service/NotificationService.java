package org.rohit.service;

import org.rohit.model.NotificationLog;
import org.rohit.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    @Value("${notification.waitTime}")
    private int notificationWaitTime;

    public boolean validateToken() {
        // validate token: ToDo
        return false;
    }

    public void sendEmail(String email, String message) {

        LocalDateTime currentTime= LocalDateTime.now();
        NotificationLog notificationLog= notificationRepository.findFirstByEmailOrderBySentAtDesc(email);

        if(currentTime.getMinute()-notificationLog.getSentAt().getMinute() < notificationWaitTime){
            System.out.println("You can't send the email from "+email+", please use another mail or try later");
        }
        else{
            System.out.println("Email sent successfully! "+message);

            NotificationLog logToBeSaved= new NotificationLog(
                    UUID.randomUUID(),email,currentTime
            );
            notificationRepository.save(logToBeSaved);
        }
    }
}
