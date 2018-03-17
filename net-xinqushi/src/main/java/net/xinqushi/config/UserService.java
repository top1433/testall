package net.xinqushi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	public String queryUserList(){
		return this.userDAO.queryUserList();
	}
}
