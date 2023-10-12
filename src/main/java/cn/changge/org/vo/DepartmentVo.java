package cn.changge.org.vo;

import lombok.Data;

/**
 * @BelongsProject: springboot-system
 * @BelongsPackage: cn.changge.org.vo
 * @Author: WangXi
 * @CreateTime: 2023-10-10  18:40
 * @Description: TODO
 * @Version: 1.0
 */
@Data

public class DepartmentVo {
    private String keyword;
    private Integer currentPage;
    private Integer pageSize;

    public Integer getStart(){
        return (this.currentPage-1)*pageSize;
    }
}
