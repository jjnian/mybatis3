package cn.clean.mapper;

import cn.clean.entity.Follower;
import org.apache.ibatis.annotations.Param;

public interface FollowerMapper {

    Integer hasFollower(@Param("userId")Integer userId, @Param("followerId")Integer followerId);

    int insertFollower(Follower record);

    int updateFollowr(@Param("userId")Integer userId, @Param("followerId")Integer followerId,@Param("status")Integer status);
}
