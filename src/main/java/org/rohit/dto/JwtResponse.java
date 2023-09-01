package org.rohit.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter@Builder
public class JwtResponse {
    private String access_token;
    private long expires_in;
    private long refresh_expires_in;
    private String refresh_token;
    private String token_type;
}
