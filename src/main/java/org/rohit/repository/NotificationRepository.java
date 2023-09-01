package org.rohit.repository;

import org.rohit.model.NotificationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationLog, UUID> {
    NotificationLog findFirstByEmailOrderBySentAtDesc(String email);
}
