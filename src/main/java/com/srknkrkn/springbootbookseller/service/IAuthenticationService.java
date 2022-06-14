package com.srknkrkn.springbootbookseller.service;

import com.srknkrkn.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
