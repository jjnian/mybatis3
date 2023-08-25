package cn.clean.mapper;

import cn.clean.entity.Dynamic;
import cn.clean.entity.user.DynamicUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicMapper {

    int insert(Dynamic record);


    List<DynamicUser> loadMyselfDynamic(@Param("userId")Integer userId,@Param("checkUserId")Integer checkUserId);

    /**
     *  没有登录的用户查看所有动态
     * @return
     */
    List<DynamicUser> selectDynamic();

    /**
     * 登录用户查看全部动态
     * @param userId
     * @return
     */
    List<DynamicUser>  selectDynamicWithUser(Integer userId);


    /**
     *  没有登录用户查看某个人的动态
     * @param checkUserId
     * @return
     */
    List<DynamicUser>  getDynamic(Integer checkUserId);

    /**
     * 登录用户查看某个人动态
     * @param userId
     * @return
     */
    List<DynamicUser>  getDynamicWithUser(@Param("userId")Integer userId,@Param("checkUserId")Integer checkUserId);

    Dynamic selectByPrimaryKey(Integer id);

    List<Dynamic> selectDynamicSimple();

    int updatedynamicCommentNum(Integer dynamicid);

    Integer updateLikeNum(@Param("dynamicId")Integer dynamicId, @Param("likeNum")Integer likeNum);

    Integer getUserIdByDynamicId(Integer dynamicId);

    Integer deleteDynamic(Integer dynamicId);

    Integer banDynamic(Integer dynamicId);

    Integer startDynamic(Integer dynamicId);
}
