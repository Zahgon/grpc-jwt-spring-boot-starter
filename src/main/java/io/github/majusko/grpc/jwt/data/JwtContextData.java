package io.github.majusko.grpc.jwt.data;

import io.jsonwebtoken.*;
import lombok.AllArgsConstructor;
import java.util.Set;

@AllArgsConstructor
public class JwtContextData {

    private final String jwt;

    private final String userId;

    private final Set<String> roles;

    private final Claims jwtClaims;

    public String getJwt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getUserId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<String> getRoles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Claims getJwtClaims() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
