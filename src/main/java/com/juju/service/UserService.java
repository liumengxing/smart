package com.juju.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author juju
 * @date 2019/06/27
 */
public interface UserService {
    @RequestMapping(value = "getCharacters/{name}", method = RequestMethod.GET)
    List<String> getCharacters(@PathVariable("name") String name);
}
