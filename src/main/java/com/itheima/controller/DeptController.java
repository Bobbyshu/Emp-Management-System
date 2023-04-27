package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
//  private static Logger log = LoggerFactory.getLogger(DeptController.class);

  @Autowired
  private DeptService deptService;


  // limited request method to GET
  // @RequestMapping(value = "/depts", method = RequestMethod.GET)

  /**
   * search department data
   *
   * @return Result of search
   */
  @GetMapping
  public Result list() {
    log.info("SEARCH all data of department");
    List<Dept> deptList = deptService.list();
    return Result.success(deptList);
  }

  /**
   * delete data of department
   *
   * @return Result of search
   */
  @DeleteMapping("/{id}")
  public Result delete(@PathVariable Integer id) {
    log.info("DELETE data based on id:{}", id);
    deptService.delete(id);
    return Result.success();
  }

  /**
   * add department
   *
   * @return result
   */
  @PostMapping
  public Result add(@RequestBody Dept dept) {
    log.info("Add department:{}", dept);
    deptService.add(dept);
    return Result.success();
  }
}
