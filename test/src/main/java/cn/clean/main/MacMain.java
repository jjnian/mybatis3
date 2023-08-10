package cn.clean.main;

import cn.clean.entity.SysUser;
import cn.clean.mapper.SysUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MacMain {
    static final String config = "mybatis-config.xml";

    public static void main(String[] args) {
        test3();
    }

    public static void test1(){
        Reader resourceAsReader = null;
        try {
            resourceAsReader = Resources.getResourceAsReader(config);
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
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser user = mapper.getUser();
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
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        List<SysUser> user = mapper.getAllUser(new RowBounds(0,1));
        System.out.println(user.toString());
    }
}
