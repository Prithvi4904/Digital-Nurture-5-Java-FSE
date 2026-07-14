package com.cognizant.springlearn.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        Map<String, String> map = new HashMap<>();

        String user = getUser(authHeader);

        JwtBuilder builder = Jwts.builder();

        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date(System.currentTimeMillis() + 1200000));
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");

        String token = builder.compact();

        map.put("token", token);

        return map;
    }

    private String getUser(String authHeader) {

        String auth = authHeader.replace("Basic ", "");

        byte[] decoded = Base64.getDecoder().decode(auth);

        String credentials = new String(decoded, StandardCharsets.UTF_8);

        return credentials.split(":")[0];
    }
}