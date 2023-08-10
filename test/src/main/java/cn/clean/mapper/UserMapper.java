package cn.clean.mapper;

import cn.clean.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
	User getUser();

	@Select("select * from test2 where id  = '1'")
	User getUserByAnn();

	@Select("select * from test2")
	List<User> getUsers();
}
