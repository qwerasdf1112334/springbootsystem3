package cn.changge.org.service;

import cn.changge.APP;
import cn.changge.base.utils.PageInfo;
import cn.changge.org.domain.Department;
import cn.changge.org.vo.DepartmentVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @BelongsProject: springboot-system
 * @BelongsPackage: cn.changge.org.mapper
 * @Author: WangXi
 * @CreateTime: 2023-10-09  15:21
 * @Description: TODO
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = APP.class)
public class DepServiceTest {
    @Autowired
    private IDempartmentService service;
    @Test
    public void test1(){
        service.findAll().forEach(System.out::println);
    }
    @Test
    public void test2(){
        service.delete(43);
    }

    @Test
    public void pageList() {
        DepartmentVo query = new DepartmentVo();
        query.setCurrentPage(1);
        query.setPageSize(2);
        PageInfo<Department> pageList = service.pageList(query);
        System.out.println("总条数:"+pageList.getTotal());
        System.out.println("当前页数据:");
        pageList.getData().forEach(System.out::println);
    }
    @Autowired
    private   IEmployeeService employeeService;
    @Test
    public void empFindAll(){
        employeeService.findAll().forEach(System.out::println);
    }


    }

