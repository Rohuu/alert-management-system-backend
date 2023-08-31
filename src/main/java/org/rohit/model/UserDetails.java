package org.rohit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_details")
public class UserDetails {
    @Id
    @GeneratedValue
    private UUID userId;
    private String userName;
    private String password;
}
