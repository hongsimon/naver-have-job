package jobless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("jspController")
public class jspTester_Controller {
	
	@RequestMapping(value="/border_broadComm")
	public String controllerborder_broadComm() {
		return "view/border/border-broadcasterCommunity";
	}
	
	@RequestMapping(value="/border_comm")
	public String controllerborder_comm_() {
		return "view/border/border-community";
	}
	
	@RequestMapping(value="/border_hotClip")
	public String controllerborder_hotClip() {
		return "view/border/border-hotClip";
	}
	
	@RequestMapping(value="/login_join")
	public String login_join() {
		return "view/loginPage/login-join";
	}
	
	@RequestMapping(value="/login_join_check")
	public String login_join_check() {
		return "view/loginPage/login-join-check";
	}
	
	@RequestMapping(value="/login_main")
	public String login_mian() {
		return "view/loginPage/login-main";
	}
	
	@RequestMapping(value="/write_border_comm")
	public String write_border_comm() {
		return "view/write/border-community-write";
	}
	
	@RequestMapping(value="/write_border_hotClip")
	public String write_border_hotClip() {
		return "view/write/border-hotClip-write";
	}
	
	@RequestMapping(value="/view_border_comm")
	public String write_border_community_view() {
		return "view/view/border-community-view";
	}
	
	@RequestMapping(value="/view_border_hotClip")
	public String write_border_hotClip_view() {
		return "view/view/border-hotClip-view";
	}
	
	@RequestMapping(value="/view_Service")
	public String userServicePage() {
		return "view/view/user_Service_Page";
	}
	
	
	
	
}
