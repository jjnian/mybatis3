/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.scripting.xmltags;

import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;

/**
 * @author Clinton Begin
 */
public class DynamicSqlSource implements SqlSource {

  private final Configuration configuration;
  private final SqlNode rootSqlNode;

  public DynamicSqlSource(Configuration configuration, SqlNode rootSqlNode) {
    this.configuration = configuration;
    this.rootSqlNode = rootSqlNode;
  }

  /**
   * 获取处理完的SQL语句
   * @Date 2023/8/24 11:43
   * @param parameterObject Mapper方法传的参数
   * @return {@link BoundSql }
   */
  @Override
  public BoundSql getBoundSql(Object parameterObject) {
    DynamicContext context = new DynamicContext(configuration, parameterObject);
    // 组装SQL，处理${}
    rootSqlNode.apply(context);

    SqlSourceBuilder sqlSourceParser = new SqlSourceBuilder(configuration);

    Class<?> parameterType = parameterObject == null ? Object.class : parameterObject.getClass();
    // 处理SQL语句中的#{} 把#{}中的值替换成?
    // 把#{}里面的值映射成paramMapping
    SqlSource sqlSource = sqlSourceParser.parse(context.getSql(), parameterType, context.getBindings());

    BoundSql boundSql = sqlSource.getBoundSql(parameterObject);

    context.getBindings().forEach(boundSql::setAdditionalParameter);
    return boundSql;
  }

}
