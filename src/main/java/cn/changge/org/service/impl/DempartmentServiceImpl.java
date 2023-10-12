package cn.changge.org.service.impl;

import cn.changge.base.utils.PageInfo;
import cn.changge.org.domain.Department;
import cn.changge.org.mapper.DepartmentMapper;
import cn.changge.org.service.IDempartmentService;
import cn.changge.org.vo.DepartmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @BelongsProject: springboot-system
 * @BelongsPackage: cn.changge.org.service.impl
 * @Author: WangXi
 * @CreateTime: 2023-10-09  16:12
 * @Description: TODO
 * @Version: 1.0
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class DempartmentServiceImpl implements IDempartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    @Transactional
    public void insert(Department department) {

        departmentMapper.insert(department);
        if (Objects.isNull(department.getParent().getId())){
            department.setPath("/" + department.getId());
        }else {
            Department parent = departmentMapper.findById(department.getParent().getId());
            department.setPath(parent.getPath()+"/" + department.getId());
        }
        departmentMapper.update(department);
    }

    @Override
    @Transactional
    public void delete(Serializable id) {
        departmentMapper.delete(id);

    }

    @Override
    @Transactional
    public void update(Department department) {


        if (Objects.isNull(department.getParent().getId())){
            department.setPath("/" + department.getId());
        }else {
            Department parent = departmentMapper.findById(department.getParent().getId());
            department.setPath(parent.getPath()+"/" + department.getId());
        }
        departmentMapper.update(department);
    }

    @Override
    public Department findById(Serializable id) {
        return departmentMapper.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }

    @Override
    public PageInfo<Department> pageList(DepartmentVo departmentVo) {
         Long total=departmentMapper.querryTotal(departmentVo);
         if (total>0){
             List<Department> data=departmentMapper.querryData(departmentVo);
             return new PageInfo<Department>(total,data);
         }
        return new PageInfo<Department>();
    }
    @Override
    public void batchDelete(List<Long> ids) {
        departmentMapper.batchDelete(ids);
    }

    @Override
    public List<Department> getDeptTree() {
        return departmentMapper.getTree();
    }
}
