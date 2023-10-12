package cn.changge.org.mapper;

import cn.changge.org.domain.Department;
import cn.changge.org.vo.DepartmentVo;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * @BelongsProject: springboot-system
 * @BelongsPackage: cn.changge.org.mapper
 * @Author: WangXi
 * @CreateTime: 2023-10-09  13:10
 * @Description: TODO
 * @Version: 1.0
 */
public interface DepartmentMapper {
    void insert(Department department);
    void delete(Serializable id);
    void update(Department department);
    Department findById(Serializable id);
    List<Department> findAll();

    Long querryTotal(DepartmentVo departmentVo);

    List<Department> querryData(DepartmentVo departmentVo);
    void batchDelete(@Param("ids") List<Long> ids);

    List<Department> getTree();
}
