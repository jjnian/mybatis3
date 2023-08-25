package cn.clean.mapper;

import cn.clean.entity.DetailSelectCondition;
import cn.clean.entity.FindFriendMsg;
import cn.clean.entity.SimpleSelectCondition;

import java.util.List;

public interface FindFriendMsgMapper {

    int insert(FindFriendMsg record);

    List<FindFriendMsg> allMsg(SimpleSelectCondition simpleSelectCondition);

    List<FindFriendMsg> detailSelectMsg(DetailSelectCondition detailSelectCondition);
}
