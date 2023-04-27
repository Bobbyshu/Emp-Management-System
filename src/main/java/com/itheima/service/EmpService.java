package com.itheima.service;

import com.itheima.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 员工管理
 */
public interface EmpService {
  /**
   * 分页查询
   *
   * @param page
   * @param pageSize
   * @return
   */
  PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);
}
