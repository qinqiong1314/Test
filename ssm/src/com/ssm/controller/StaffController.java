package com.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Staff;
import com.ssm.service.StaffService;
import com.ssmo.util.Pager;


@Controller
public class StaffController {
	@Resource(name = "staffService")
	private StaffService staffService;

	@RequestMapping("staffController_find")
	public ModelAndView find(@RequestParam(value = "page", required = true) Integer page,
			@RequestParam(value = "rows", required = true) Integer rows) {
		ModelAndView modelAndView = new ModelAndView("stafflist");

		Integer pageno = (page - 1) * rows;
		Integer pagesize = page * rows;

		Pager<Staff> pager = staffService.findPager(pageno, pagesize);
		modelAndView.addObject("staffs", pager.getRows());
		modelAndView.addObject("total", pager.getTotal());
		modelAndView.addObject("page", page);

		return modelAndView;

	}
}
