package com.mlapuma.whatsappaireply.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JwtServiceTest {
    @Test
    void shouldGenerateAndReadTokenSubject() {
        JwtService service = new JwtService("test_secret_test_secret_test_secret_1234", 60);
        String token = service.generateToken("user@example.com");
        assertEquals("user@example.com", service.extractSubject(token));
    }
}
