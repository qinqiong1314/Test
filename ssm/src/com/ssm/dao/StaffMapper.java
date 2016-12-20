package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssm.pojo.Staff;

@Repository("staffMapper")
public interface StaffMapper {
	  
	  List<Staff> findPager(
	      @Param("pageno")Integer pageno,
	      @Param("pagesize")Integer pagesize);

	  int findTotal();
}
