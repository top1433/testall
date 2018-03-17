package net.xinqushi.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ActionContext;

import net.xinqushi.model.User;
import net.xinqushi.service.UserService;
@Component
public class UserAction {
	
	User user;
	
	UserService service;

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getService() {
		return service;
	}

	@Resource(name="service")
	public void setService(UserService service) {
		this.service = service;
	}

	public String add() {
		service.add(user);
		ActionContext.getContext().getSession().put("USER", user);
		return "main";
	}
	//注册时,判断用户名是否存在的action
	public String checkExsits() throws IOException {
		boolean flag=service.checkExists(user);
		HttpServletResponse response=ServletActionContext.getResponse();
		PrintWriter out=response.getWriter();
		if(flag) {
			out.print("1");
		}else {
			out.print("0");
		}
		return null;
	}
	//登录的action,如果用户存在转向main,不存在转向login
	public String login() {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		String result="longin";
		if(service.checkExists(user)) {
			session.setAttribute("USER", user);
			result="main";
		}
		return result;
	}
	//退出登录的action
	public String logout() {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.setAttribute("USER", null);
		return "main";
	}
}
