package com.rui.mybatis.test;

import com.rui.mybatis.mapper.EmpMapper;
import com.rui.mybatis.pojo.Emp;
import com.rui.mybatis.pojo.EmpExample;
import com.rui.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/23 20:01
 * @Version 1.0
 */
public class MGBTest {

    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
        //查询所有数据
//        List<Emp> list = mapper.selectByExample(null);
//        list.forEach(System.out::println);
        // 根据条件来查询数据
//        EmpExample example = new EmpExample();
//        example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(10);
//        example.or().andGenderEqualTo("男");
//        List<Emp> list = mapper.selectByExample(example);
//        list.forEach(System.out::println);
        //测试普通修改
//        Emp emp = new Emp(1,"小懒",null,"女");
//        mapper.updateByPrimaryKey(emp);
        //测试选择性修改
        Emp emp = new Emp(1,"小懒",null,"女");
        mapper.updateByPrimaryKeySelective(emp);
    }

}
