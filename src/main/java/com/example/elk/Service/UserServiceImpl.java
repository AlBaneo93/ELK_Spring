package com.example.elk.Service;

import com.example.elk.Repository.UserRepository;
import com.example.elk.vo.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User Login(User user) {
    return userRepository.findByIdAndPassword(user.getId(), user.getPassword());
  }

  @Override
  public User Logout(User user) {
    return userRepository.findByIdAndPassword(user.getId(), user.getPassword());
  }

  @Override
  public User About(User user) {
    Optional<User> opUser = userRepository.findById(user.getUid());

    return opUser.get();
  }

  @Override
  public User Search(User user) {
    return userRepository.findById(user.getUid()).get();
  }

  @Override
  public List<User> SearchAll() {
    return userRepository.findAll();
  }
}
