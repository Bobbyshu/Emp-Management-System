package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
  /**
   * search all data of department
   *
   * @return
   */
  @Select("select * from dept")
  List<Dept> list();

  /**
   * delete by id.
   *
   * @param id input id
   */
  @Delete("delete from dept where id = #{id}")
  void deleteById(Integer id);

  /**
   * add department
   *
   * @param dept added one
   */
  @Insert("insert into dept(name, create_time, update_time) values(#{name}, #{createTime}, #{updateTime})")
  void insert(Dept dept);
}
