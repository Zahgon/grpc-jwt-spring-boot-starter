package io.github.majusko.grpc.jwt.service.dto;

import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
public class JwtToken {

    private String token;

    private LocalDateTime expiration;

    public String getToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public LocalDateTime getExpiration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
