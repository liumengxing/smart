package com.juju.smart.service;

import com.juju.smart.entity.User;
import com.juju.smart.request.UserRequest;
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
    User findById(@PathVariable("id") Long id);

//    @RequestMapping(value = "user/add", method = RequestMethod.POST)
//    Long add(@PathVariable("user")UserRequest request);
}
