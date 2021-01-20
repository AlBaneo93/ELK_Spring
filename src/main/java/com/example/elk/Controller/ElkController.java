package com.example.elk.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/elk")
@Slf4j
public class ElkController {


  @RequestMapping("/acc")
  public ResponseEntity<Map<String, Object>> AccessUser() {
    log.info("Someone Accessed");
    Map<String, Object> map = new HashMap<>();
    map.put("msg", "WelCome!");
    return new ResponseEntity<>(map, HttpStatus.OK);
  }

  @RequestMapping("/about")
  public ResponseEntity<Map<String, Object>> About() {
    log.info("Someone Accessed");
    Map<String, Object> map = new HashMap<>();
    map.put("msg", "WelCome!");
    return new ResponseEntity<>(map, HttpStatus.OK);
  }

}
