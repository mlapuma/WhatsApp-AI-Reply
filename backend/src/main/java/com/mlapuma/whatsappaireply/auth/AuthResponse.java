package com.mlapuma.whatsappaireply.auth;
public record AuthResponse(String token, String tokenType) {
    public AuthResponse(String token) { this(token, "Bearer"); }
}
