package cn.changge.org.mapper;

import cn.changge.org.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @BelongsProject: springboot-system
 * @BelongsPackage: cn.changge.org.mapper
 * @Author: WangXi
 * @CreateTime: 2023-10-09  13:10
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface EmployeeMapper {
    List<Employee> findAll();
}
