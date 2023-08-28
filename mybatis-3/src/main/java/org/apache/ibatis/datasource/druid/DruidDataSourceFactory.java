package org.apache.ibatis.datasource.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 *
 */
public class DruidDataSourceFactory extends PooledDataSourceFactory {


	public DruidDataSourceFactory() {
		this.dataSource = new DruidDataSource();
	}
}
