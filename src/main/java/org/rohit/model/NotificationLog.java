package org.rohit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Entity
public class NotificationLog {
    @Id
    private UUID notificationId;
    private String email;
    private LocalDateTime sentAt;
}
