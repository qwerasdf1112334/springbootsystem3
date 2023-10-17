package cn.changge.auth.service.impl;

import cn.changge.auth.domain.Role;
import cn.changge.auth.dto.RoleDTO;
import cn.changge.auth.mapper.RoleMapper;
import cn.changge.auth.service.IRoleService;
import cn.changge.base.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangxi
 * @since 2023-10-13
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void roleAuth(RoleDTO roleDTO) {
        roleMapper.deleteAll(roleDTO);
        roleMapper.roleAuth( roleDTO);
    }

    @Override
    public List<Long> queryRolePermissionIds(Long id) {
        return roleMapper.queryRolePermissionIds(id);
    }
}
