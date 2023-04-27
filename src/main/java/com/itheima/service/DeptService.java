package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
  /**
   * search all data in department
   *
   * @return List<Dept>
   */
  List<Dept> list();

  /**
   * delete department based on id
   *
   * @param id deleted one
   */
  void delete(Integer id);

  /**
   * add department
   *
   * @param dept added one
   */
  void add(Dept dept);
}
