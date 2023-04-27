package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {
  /**
   * 查询总记录数
   * @return
   */
//  @Select("select count(*) from emp")
//  public Long count();

//  @Select("select * from emp limit #{start}, #{pageSize}")
//  public List<Emp> page(Integer start, Integer pageSize);

  /**
   * 分页查询，获取列表数据
   * @return
   */
  // @Select("select * from emp")
  public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

}
