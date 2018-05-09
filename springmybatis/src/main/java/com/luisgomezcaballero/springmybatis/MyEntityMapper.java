package com.luisgomezcaballero.springmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyEntityMapper {

	@Select("select * from myentity")
	List<MyEntity> findAll();
}
