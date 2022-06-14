package com.srknkrkn.springbootbookseller.security.jwt;

import com.srknkrkn.springbootbookseller.security.UserPrincipal;
import io.jsonwebtoken.Claims;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider
{

    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);

    Claims extractClaims(HttpServletRequest request);


}
