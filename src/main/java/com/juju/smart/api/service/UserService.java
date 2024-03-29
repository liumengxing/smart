package com.juju.smart.api.service;

import com.juju.smart.api.response.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author juju
 * @date 2019/06/27
 */
@Service
public interface UserService {
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    UserResponse findById(@PathVariable("id") Long id);
}
