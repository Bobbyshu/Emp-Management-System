package com.itheima.controller;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 员工管理Controller
 */
@Slf4j
@RestController
public class EmpController {
  @Autowired
  private EmpService empService;

  @GetMapping("/emps")
  public Result page(@RequestParam(defaultValue = "1") Integer page,
                     @RequestParam(defaultValue = "10") Integer pageSize,
                     String name, Short gender,
                     @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                     @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
    log.info("分页查询，参数：{}, {}, {}, {}, {}, {}", page, pageSize, name, gender, begin, end);
    // 调用service
    PageBean pageBean = empService.page(page, pageSize, name, gender, begin, end);
    return Result.success(pageBean);
  }
}
