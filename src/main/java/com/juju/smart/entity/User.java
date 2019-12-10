package com.juju.smart.entity;

import com.google.common.base.Converter;
import com.juju.smart.api.request.UserRequest;
import com.juju.smart.api.response.UserResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotBlank;

/**
 * @author juju
 * @date 2019/06/27
 */
@Accessors(chain = true)
@Getter
@Setter
public class User {
    private long id;
    @NotBlank
    private String name;

    @Override
    public String toString() {
        return String.format("id = %s, name = %s", id, name);
    }

    // region build构造

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private long id;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            User student = new User();
            student.setId(id);
            student.setName(name);
            return student;
        }
    }
    // endregion

    // region convert方法

    public UserResponse entityConvertToResponse() {
        UserConvertToResponse convert = new UserConvertToResponse();
        return convert.doBackward(this);
    }

    public User requestConvertToEntity(UserRequest request) {
        RequestConvertToUser convert = new RequestConvertToUser();
        return convert.doForward(request);
    }

    private static class UserConvertToResponse extends Converter<UserResponse, User> {
        @Override
        protected User doForward(UserResponse userResponse) {
            throw new AssertionError("不支持response转化成entity!");
        }

        @Override
        protected UserResponse doBackward(User user) {
            UserResponse response = new UserResponse();
            BeanUtils.copyProperties(user, response);
            return response;
        }
    }

    private static class RequestConvertToUser extends Converter<UserRequest, User> {
        @Override
        protected User doForward(UserRequest userRequest) {
            User user = new User();
            BeanUtils.copyProperties(userRequest, user);
            return user;
        }

        @Override
        protected UserRequest doBackward(User user) {
            throw new AssertionError("不支持entity转化成request!");
        }
    }
    // endregion
}

