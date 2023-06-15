package com.rui.mybatis.mapper;

import com.rui.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/22 20:55
 * @Version 1.0
 */
public interface EmpMapper {

    // 根据id查询员工信息
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    //获取员工和所对应的部门信息
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    //分布1   查询员工以及对应部门的信息
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    //  //通过分布查询部门以及部门中的员工信息 第二步
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);


}
