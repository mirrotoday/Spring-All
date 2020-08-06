package com.xpossess.springboot.mapper;

import com.xpossess.springboot.bean.Departments;
import org.apache.ibatis.annotations.*;

/**
 * @author : FreeStyle
 * @Mapper : 指定这是一个操作数据库的mapper
 * 通过 @Select , @Delete ,@Insert ,@Update 注解版Mybatis 操作数据库
 *  @Options(useGeneratedKeys = true,keyProperty = "id")  插入时获取主键和自增id
 */
@Mapper
public interface DepartmentsMapper {
    @Select("select * from department")
    public Departments getDeptById(Integer id);

    @Delete("delete from departments where id = #{id}" )
    public  int deleteDeptById(Integer id);
    //
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Departments departments);

    @Update("update departments set department_name = #{departmentName} where id = #{id}")
    public int updateDept(Departments departments);


}
