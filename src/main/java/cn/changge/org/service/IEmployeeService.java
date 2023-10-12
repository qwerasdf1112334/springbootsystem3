package cn.changge.org.service;

import cn.changge.org.domain.Employee;

import java.util.List;

/**
 * @BelongsProject: springboot-system
 * @BelongsPackage: cn.changge.org.service
 * @Author: WangXi
 * @CreateTime: 2023-10-11  17:31
 * @Description: TODO
 * @Version: 1.0
 */
public interface IEmployeeService {


    List<Employee> findAll();
}
