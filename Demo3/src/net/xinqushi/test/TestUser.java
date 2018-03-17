package net.xinqushi.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import net.xinqushi.model.User;
import net.xinqushi.utils.MybatisUtils;

public class TestUser {

	@Test
	public void test() throws IOException {
		SqlSession session = MybatisUtils.openSession();
		String statment = "net.xinqushi.model.User.selectUser";
		User user=session.selectOne(statment,1);
		System.out.println(user);
	}

}
