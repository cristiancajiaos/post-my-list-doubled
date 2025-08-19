package com.example.postmylistdoubled.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list-number")
public class ListController {

  @PostMapping("/double")
  @ResponseBody
  public List<Long> doubleListNumbers(@RequestBody List<Long> numbers) {
    return numbers.stream().map(this::doubleNumber).collect(Collectors.toList());
  }

  public Long doubleNumber(Long number) {
    return number * 2;
  }

}
