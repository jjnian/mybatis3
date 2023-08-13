package cn.clean.mapper;

import cn.clean.entity.SysUser;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SysUserMapper {
    SysUser getSysUser();

    SysUser getUser();

    List<SysUser> getAllUser(RowBounds rowBounds);

    @Select("select id,nickname from user where id  = 14")
    SysUser getUserById();
}
