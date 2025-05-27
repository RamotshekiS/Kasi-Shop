package com.selloramotsheki.eCommerce.service.user;

import com.selloramotsheki.eCommerce.model.User;
import com.selloramotsheki.eCommerce.request.CreateUserRequest;
import com.selloramotsheki.eCommerce.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
}
