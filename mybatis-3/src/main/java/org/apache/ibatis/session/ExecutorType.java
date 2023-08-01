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
package org.apache.ibatis.session;

/**
 * @author Clinton Begin
 */
public enum ExecutorType {

  // 执行器是最简单的执行器，每执行一次 SQL 语句就会开启一个新的数据库连接，
  // 并执行完毕后立即关闭连接。这种执行器适用于短期生存的 SQL 语句，比如简单的查询，
  // 但对于频繁执行的 SQL 或需要复用连接的情况效率不高
  SIMPLE,

  // 会复用先前的数据库连接，如果有可用的数据库连接，就会直接使用，
  // 没有的话才会创建新的连接。
  // 这样可以避免频繁地创建和销毁数据库连接，提高执行效率。
  // 适用于较为频繁的 SQL 执行情况
  REUSE,

  // 用于批量处理 SQL 语句，它会将一组 SQL 语句一次性发送给数据库执行，
  // 然后等待所有语句执行完成后再一次性获取结果。
  // 这种执行器适用于批量操作，比如批量插入或更新大量数据
  BATCH

}
