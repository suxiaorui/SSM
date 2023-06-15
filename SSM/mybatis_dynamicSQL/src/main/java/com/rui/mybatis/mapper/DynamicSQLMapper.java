package com.rui.mybatis.mapper;

import com.rui.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/23 15:07
 * @Version 1.0
 */
public interface DynamicSQLMapper {

    // 根据条件查询员工信息
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    // 批量添加员工信息
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    //批量删除功能
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);



}
