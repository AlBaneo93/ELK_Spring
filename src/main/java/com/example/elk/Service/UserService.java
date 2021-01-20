package com.example.elk.Service;

import com.example.elk.vo.User;

import java.util.List;

public interface UserService {
  User Login(User user);

  User Logout(User user);

  User About(User user);

  User Search(User user);

  List<User> SearchAll();
}
