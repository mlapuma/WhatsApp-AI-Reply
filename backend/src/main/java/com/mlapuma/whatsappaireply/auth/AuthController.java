package com.mlapuma.whatsappaireply.auth;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final AuthService service;
    public AuthController(AuthService service){this.service=service;}
    @PostMapping("/register") @ResponseStatus(HttpStatus.CREATED)
    public AuthResponse register(@Valid @RequestBody RegisterRequest request){return service.register(request);}
    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest request){return service.login(request);}
}
