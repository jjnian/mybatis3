package cn.clean.mapper;

import cn.clean.entity.LikeRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LikeRecordMapper {

    int insertSelective(LikeRecord record);

    LikeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LikeRecord record);

    int updateByUserAndDynamic(@Param("userId")Integer userId,@Param("dynamicId")Integer dynamicId,@Param("status")Integer status);

    Integer hasRecord(Integer userId,Integer dynamicId);

    List<Integer> selectUserLike(Integer userId);
}
