package net.xinqushi.dao.impl;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import net.xinqushi.dao.UserDAO;
import net.xinqushi.model.User;
@Component(value="fileDAO")
@Scope(value="singleton")
public class UserDAOFileImpl implements UserDAO {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("e:\\user.txt",true);
			fw.write(user.getUsername()+":"+user.getUserpwd());
			fw.write("\r\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Boolean checkExists(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
