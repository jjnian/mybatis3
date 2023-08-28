package cn.clean.main;

import cn.clean.mapper.Db2Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 *
 */
public class DB2Main {
	public static void main(String[] args) {
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config-db2.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		Db2Mapper mapper = sqlSession.getMapper(Db2Mapper.class);
		System.out.println(mapper.testDb("select * from test_allv"));
	}
}
