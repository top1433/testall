package net.xinqushi.dao.impl;


import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import net.xinqushi.dao.UserDAO;
import net.xinqushi.model.User;
//@Component(value="sqlDAO")
@Repository(value="sqlDAO")
@Scope(value="singleton")
public class UserDAOMysqlImpl implements UserDAO {
	
	HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}
	@Resource
	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		hibernatetemplate.merge(user);
	}
	@Override
	public Boolean checkExists(User user) {
		// TODO Auto-generated method stub
		return hibernatetemplate.findByExample(user).size()>0;
	}
}
