package cn.clean;

import cn.clean.entity.CloudUser;
import cn.clean.entity.SysUser;
import cn.clean.entity.User;
import cn.clean.mapper.CloudUserMapper;
import cn.clean.mapper.SysUserMapper;
import cn.clean.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 */
public class Main {
	public static void main(String[] args) {
		test1();
	}

	public static void test(){
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config1.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = mapper.getUser();
		System.out.println(user.toString());
	}

	public static void test1(){
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
		SysUser user = mapper.getSysUser();
		System.out.println(user.toString());
	}

	public static void test2(){
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		CloudUserMapper mapper = sqlSession.getMapper(CloudUserMapper.class);
		CloudUser user = mapper.getSysUser(0,"ji");
		System.out.println(user.toString());
	}

	public static void test3(){
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		CloudUserMapper mapper = sqlSession.getMapper(CloudUserMapper.class);
		CloudUser cloudUser = new CloudUser();
		cloudUser.setId(0);
		cloudUser.setName("ji");
		CloudUser user = mapper.getSysUser1(cloudUser);
		System.out.println(user.toString());
	}

	public static void test4(){
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		CloudUserMapper mapper = sqlSession.getMapper(CloudUserMapper.class);
		Map<String,Object> cloudUser = new HashMap<>();
		cloudUser.put("id",0);
		cloudUser.put("name","ji");
		CloudUser user = mapper.getSysUser2(cloudUser);
		System.out.println(user.toString());
	}

	public static void test5(){
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		CloudUserMapper mapper = sqlSession.getMapper(CloudUserMapper.class);
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(0);
		integers.add(1);
		CloudUser user = mapper.getSysUser3(integers);
		System.out.println(user.toString());
	}

	public static void test6(){
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(resourceAsReader);
		SqlSession sqlSession = ssf.openSession();
		CloudUserMapper mapper = sqlSession.getMapper(CloudUserMapper.class);
		LinkedList<Object> integers = new LinkedList<>();
		integers.add("1");
		integers.add("0");
		CloudUser user = mapper.getSysUser4("user",integers);
		System.out.println(user.toString());
	}

}
