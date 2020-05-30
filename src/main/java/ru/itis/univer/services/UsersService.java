package ru.itis.univer.services;

import ru.itis.univer.dto.UserDto;

import java.util.List;

public interface UsersService {
    List<UserDto> getAllUsers();
    UserDto getUser(Long userId);
}
