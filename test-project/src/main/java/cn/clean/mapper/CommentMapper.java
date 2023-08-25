package cn.clean.mapper;

import cn.clean.entity.comment.Comment;
import cn.clean.entity.comment.CommentUser;
import java.util.List;

public interface CommentMapper {


    int insert(Comment record);

    Comment selectByPrimaryKey(Integer id);

    List<CommentUser> selectComment(Integer dynamicId);

    List<Integer> selectDynamicUser(Integer dynamicId);

}
