package com.ssm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.pojo.Staff;
import com.ssm.service.StaffService;
import com.ssmo.util.Pager;

public class StaffText {
	private StaffService staffService;
	
	  @Test
	  public void findPager() {
	    // easyui 必需参数
	    Integer page = 2;
	    Integer rows = 5;

	    // 处理起始页和结束页
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;

	    Pager<Staff> pager = staffService.findPager(pageno, pagesize);
	    		
	    System.out.println("分页总数: " + pager.getTotal());
	    for (Staff staff : pager.getRows()) {
	      System.out.println(staff.getDname() + " " +staff.getEname() + " "+staff.getJob() + " "+staff.getLoc() + " "+staff.getSal());
	    }
	  }
	  

	
	
	  @SuppressWarnings("resource")
	  @Before
	  public void init() {
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    staffService = ctx.getBean("staffService", StaffService.class);
	  }
	}