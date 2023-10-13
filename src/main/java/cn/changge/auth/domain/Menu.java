package cn.changge.auth.domain;

import java.math.BigDecimal;
import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author wangxi
 * @since 2023-10-13
 */
public class Menu extends BaseDomain{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String url;
    private String icon;
    private Long parentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Menu{" +
        ", id=" + id +
        ", name=" + name +
        ", url=" + url +
        ", icon=" + icon +
        ", parentId=" + parentId +
        "}";
    }
}
