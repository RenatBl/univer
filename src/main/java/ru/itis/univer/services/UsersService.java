package ru.itis.univer.services;

import ru.itis.univer.dto.UserDto;
import ru.itis.univer.models.User;

import java.util.List;

public interface UsersService {
    List<UserDto> getAllUsers();

    UserDto getUser(Long userId);

    void updateUser(User user);
}
