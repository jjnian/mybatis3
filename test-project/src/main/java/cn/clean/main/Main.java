package cn.clean.main;

import cn.clean.entity.user.User;
import cn.clean.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 *
 */
public class Main {
	public static void main(String[] args) {

		test();
	}

	public static void test() {
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = mapper.getUserInfo(9);
		System.out.println(user);
	}





}
