package com.luisgomezcaballero.springmybatis;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(MyEntity.class)
@MapperScan("com.luisgomezcaballero.springmybatis")
@SpringBootApplication
public class SpringmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmybatisApplication.class, args);
	}
}
