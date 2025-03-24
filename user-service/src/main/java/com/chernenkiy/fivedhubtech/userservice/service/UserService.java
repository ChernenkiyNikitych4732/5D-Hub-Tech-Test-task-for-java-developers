package com.chernenkiy.fivedhubtech.userservice.service;

import com.chernenkiy.fivedhubtech.userservice.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser (UserDto userDto);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers(int page, int size);
    List<UserDto> getUsersByName(String name);
    List<UserDto> getUsersBySurname(String Surname);
    List<UserDto> getUsersByBirthdate(String Birthday);
    UserDto updateUser (Long id, UserDto userDto);
    void deleteUser (Long id);
}