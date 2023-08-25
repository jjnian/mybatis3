package cn.clean.mapper;

import cn.clean.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface PermissionMapper {


    Integer updatePer(Integer userId,Map map);

    Integer updateLocation(Integer userId,Map map);

    Permission selectUserPer(Integer userId);

}
