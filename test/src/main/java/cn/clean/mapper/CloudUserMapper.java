package cn.clean.mapper;

import cn.clean.entity.CloudUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CloudUserMapper {
    CloudUser getSysUser(@Param("id") Integer id, @Param("name") String name);

    CloudUser getSysUser1(CloudUser cloudUser);

    CloudUser getSysUser2(Map map);

    CloudUser getSysUser3(@Param("jiruixin") List<Integer> list);
}
