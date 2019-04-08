package com.yj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yj.Dept;
import com.yj.Student;

@Mapper
public interface IDeptDao {

	public List<Student> findAll();
}
