package com.blackfox.orderbook.conf;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.logging.log4j2.Log4j2LoggerImpl;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.blackfox.orderbook.dao.CustomerMapper;
import com.blackfox.orderbook.dao.ManufactorMapper;
import com.blackfox.orderbook.dao.OrderDetailMapper;
import com.blackfox.orderbook.dao.OrderMapper;
import com.blackfox.orderbook.dao.ProductMapper;
import com.blackfox.orderbook.dao.ProductTypeMapper;

public class MybatisConfig {
	private static SqlSessionFactory factory;
	
	private static Configuration getConf() {
		DataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver",
				"jdbc:mysql://localhost:3306/db_orderbook?useUnicode=true&characterEncoding=utf8", "root", "");
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);
		configuration.setLogImpl(StdOutImpl.class);
		configuration.addMapper(CustomerMapper.class);
		configuration.addMapper(ManufactorMapper.class);
		configuration.addMapper(OrderMapper.class);
		configuration.addMapper(ProductMapper.class);
		configuration.addMapper(ProductTypeMapper.class);
		configuration.addMapper(OrderDetailMapper.class);
		return configuration;
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		if (factory == null) {
			factory = new SqlSessionFactoryBuilder().build(getConf());
		}
		return factory;
	}
}
