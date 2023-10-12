package cn.changge.org.service;

import cn.changge.base.utils.PageInfo;
import cn.changge.org.domain.Department;
import cn.changge.org.vo.DepartmentVo;

import java.io.Serializable;
import java.util.List;

/**
 * @BelongsProject: springboot-system
 * @BelongsPackage: cn.changge.org.service
 * @Author: WangXi
 * @CreateTime: 2023-10-09  16:11
 * @Description: TODO
 * @Version: 1.0
 */
public interface IDempartmentService {
    void insert(Department department);
    void delete(Serializable id);
    void update(Department department);
    Department findById(Serializable id);
    List<Department> findAll();

    PageInfo<Department> pageList(DepartmentVo departmentVo);

    void batchDelete(List<Long> ids);

    List<Department> getDeptTree();
}
