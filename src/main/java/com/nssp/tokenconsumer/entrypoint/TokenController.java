package com.nssp.tokenconsumer.entrypoint;

import com.nssp.token.usecase.TokenOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TokenController {

    private TokenOperations tokenOperations;
    public TokenController(TokenOperations tokenOperations) {
        this.tokenOperations = tokenOperations;
    }

    @GetMapping("/token")
    public String get() {
        return this.tokenOperations.get();
    }
}
