package com.rui.mybatis.mapper;

import com.rui.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/23 9:49
 * @Version 1.0
 */
public interface DeptMapper {

    // 通过分布查询查询员工以及所对应的部门信息的第二步
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    // 查询部门以及部门中的员工信息
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    //通过分布查询部门以及部门中的员工信息 第一步
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);


}
