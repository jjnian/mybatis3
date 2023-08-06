package cn.clean.mapper;

import cn.clean.entity.CloudUser;
import org.apache.ibatis.annotations.Param;

public interface CloudUserMapper {
    CloudUser getSysUser(@Param("id") Integer id, @Param("name") String name);
}
