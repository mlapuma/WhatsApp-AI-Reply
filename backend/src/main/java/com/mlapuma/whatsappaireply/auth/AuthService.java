package com.mlapuma.whatsappaireply.auth;
import com.mlapuma.whatsappaireply.security.JwtService;
import com.mlapuma.whatsappaireply.user.User;
import com.mlapuma.whatsappaireply.user.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AuthService {
    private final UserRepository users; private final PasswordEncoder encoder; private final JwtService jwt;
    public AuthService(UserRepository users, PasswordEncoder encoder, JwtService jwt) {
        this.users=users; this.encoder=encoder; this.jwt=jwt;
    }
    public AuthResponse register(RegisterRequest r) {
        String email=r.email().trim().toLowerCase();
        if(users.existsByEmailIgnoreCase(email)) throw new ResponseStatusException(HttpStatus.CONFLICT,"Email already registered");
        User user=users.save(new User(email,encoder.encode(r.password()),r.displayName().trim()));
        return new AuthResponse(jwt.generateToken(user.getEmail()));
    }
    public AuthResponse login(LoginRequest r) {
        User user=users.findByEmailIgnoreCase(r.email().trim()).orElseThrow(() -> unauthorized());
        if(!encoder.matches(r.password(),user.getPasswordHash())) throw unauthorized();
        return new AuthResponse(jwt.generateToken(user.getEmail()));
    }
    private ResponseStatusException unauthorized(){return new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Invalid credentials");}
}
