package com.im.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.im.pojo.Invitation;
import com.im.service.InvitationService;

/**
 * @author JinZiyang
 * @category 帖子控制器
 */
@Controller
public class InvitationAction {
	Logger log = Logger.getLogger(InvitationAction.class);
	@Resource
	private InvitationService invitationService;

	/**
	 * 首页控制器
	 * 
	 * @returns
	 */
	@RequestMapping("/index")
	public String index() {
		return "forward:/index.jsp";
	}

	/**
	 * 列表控制器
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Model model) {
		log.debug("list...");
		List<Invitation> list = invitationService.find();
		model.addAttribute("list", list);
		return "list";
	}

	/**
	 * 删除控制器
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam int[] ids) {
		log.debug("delete...");
		boolean flag = invitationService.delete(ids);
		if (flag) {
			return "forward:/list.action";
		} else {
			return "forward:/index.jsp";
		}
	}

	/**
	 * 添加跳转控制器
	 * 
	 * @return
	 */
	@RequestMapping("/add")
	public String toAdd() {
		return "add";
	}

	/**
	 * 添加控制器
	 * 
	 * @param invitation
	 * @return
	 */
	@RequestMapping("/addSave")
	public String add(@ModelAttribute Invitation invitation) {
		log.debug("add...");
		boolean flag = invitationService.insert(invitation);
		if (flag) {
			return "forward:/list.action";
		} else {
			return "forward:/index.jsp";
		}
	}

	/**
	 * 更新跳转控制器
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/update")
	public String toUpdate(@RequestParam int id, Model model) {
		log.debug("findById...");
		Invitation invitation = invitationService.find(id);
		model.addAttribute("invitation", invitation);
		return "update";
	}

	/**
	 * 更新控制器
	 * 
	 * @param invitation
	 * @return
	 */
	@RequestMapping("/updateSave")
	public String update(@ModelAttribute Invitation invitation) {
		log.debug("update...");
		boolean flag = invitationService.update(invitation);
		if (flag) {
			return "forward:/list.action";
		} else {
			return "forward:/index.jsp";
		}
	}

	@RequestMapping("/findOne")
	public String findOne(@RequestParam int id, Model model) {
		log.debug("findOne...");
		Invitation invitation = invitationService.find(id);
		if (invitation != null) {
			model.addAttribute("invitation", invitation);
			return "info";
		} else {
			return "forward:/list.action";
		}

	}
}
