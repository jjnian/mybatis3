
## Mybatis相关源码

### 1.介绍
本项目整合Mybatis、mybatis-spring、mybatis-spring-boot-start源码到一个工程里，方便学习阅读。
会把自己阅读源码做的记录不定时更新到该项目中。

### 2.模块介绍
- mybatis-3（Mybatis源码）
- spring（mybatis-spring源码）
- spring-boot-starter（spring-boot-starter源码）
- test(简单测试源码)
- test-project(使用源码搭建的测试工程)

### 3.mybatis增强
在mybatis配置文件中使用如下方式加载mapper文件
```xml
 <mappers>
    <package name="cn.clean.mapper"/>
</mappers>
```
默认情况下只会去mapper类的同一文件夹下加载对应的XML文件，添加了可以去resources下的mybatis文件夹下加载的功能
