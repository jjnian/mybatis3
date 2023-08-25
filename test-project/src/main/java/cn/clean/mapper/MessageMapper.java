package cn.clean.mapper;

import cn.clean.entity.message.Message;
import cn.clean.entity.message.MessageTypeNum;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    List<MessageTypeNum> getTypeNum(Integer userId);

    Integer getNotice(Integer userId);

    Integer hasMessage(@Param("userId")Integer userId, @Param("dynamicId")Integer dynamicId);

    Integer hasCommentMessage(@Param("userId")Integer userId,@Param("dynamicId")Integer dynamicId ,@Param("commentId")Integer commentId);

    List getFolloeMessage(@Param("userId")Integer userId, @Param("type")Integer type);

    List getLikeMessage(@Param("userId")Integer userId, @Param("type")Integer type);

    List getSystemMessage(@Param("userId")Integer userId, @Param("type")Integer type);

    List getCommentMessage(@Param("userId")Integer userId, @Param("type")Integer type);

    Integer hasReadMessage(Integer messageId);

    Integer readAllMessage(@Param("userId")Integer userId, @Param("messageType")Integer messageType);


}
