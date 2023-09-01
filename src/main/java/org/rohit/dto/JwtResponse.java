package org.rohit.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter@Builder
public class JwtResponse {
    private String jwtToken;
    private String userName;
}
