package io.github.majusko.grpc.jwt.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import javax.crypto.SecretKey;
import java.util.List;

@Builder
@AllArgsConstructor
public class JwtMetadata {

    private Long expirationSec;

    private SecretKey key;

    private List<String> env;

    public Long getExpirationSec() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SecretKey getKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getEnv() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
