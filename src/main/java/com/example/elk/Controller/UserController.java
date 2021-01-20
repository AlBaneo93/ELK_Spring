package com.example.elk.Controller;

import com.example.elk.Service.UserService;
import com.example.elk.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {


  private final UserService userService;

  UserController(UserService userService) {
    this.userService = userService;
  }

  public ResponseEntity<Map<String, Object>> Login(User user) {
    Map<String, Object> map = new HashMap<>();
    log.info(user.getId() + ", Attempt to Login ");
    try {
      map.put("result", userService.Login(user));
      map.put("msg", true);
      log.info(user.getId() + ", Success to Login");
    } catch (Exception e) {
      map.put("msg", false);
      log.info("Login Failed");
    }
    return new ResponseEntity<>(map, HttpStatus.OK);
  }

  public ResponseEntity<Map<String, Object>> Logout(User user) {
    Map<String, Object> map = new HashMap<>();
    log.info(user.getId() + " Logout");
    try {
      map.put("result", userService.Logout(user));
      map.put("msg", true);
    } catch (Exception e) {
      map.put("msg", false);
      log.info("Logout Failed");
      log.info(e.getMessage());
    }
    return new ResponseEntity<>(map, HttpStatus.OK);
  }

  public ResponseEntity<Map<String, Object>> About(User user) {
    Map<String, Object> map = new HashMap<>();
    log.info("M_About");
    try {
      map.put("result", userService.About(user));
      map.put("msg", true);
    } catch (Exception e) {
      map.put("msg", false);
    }
    return new ResponseEntity<>(map, HttpStatus.OK);
  }

  public ResponseEntity<Map<String, Object>> Search(User user) {
    Map<String, Object> map = new HashMap<>();
    log.info("M_Search");
    try {
      map.put("result", userService.Search(user));
      map.put("msg", true);
    } catch (Exception e) {
      map.put("msg", false);
    }
    return new ResponseEntity<>(map, HttpStatus.OK);
  }

  public ResponseEntity<Map<String, Object>> SearchAll() {
    Map<String, Object> map = new HashMap<>();
    log.info("SearchAll");
    try {
      map.put("result",userService.SearchAll());
      map.put("msg", true);
    } catch (Exception e) {
      log.info(e.getMessage() + ", M_SearchAll");
      map.put("msg", false);
    }
    return new ResponseEntity<>(map, HttpStatus.OK);
  }
}
