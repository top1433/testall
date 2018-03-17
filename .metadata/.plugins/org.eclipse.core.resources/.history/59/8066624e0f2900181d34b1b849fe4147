package net.xinqushi.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import net.xinqushi.common.MybatisUtils;
import net.xinqushi.model.Contact;
import net.xinqushi.model.ContactMapper;
import net.xinqushi.model.Student;
import net.xinqushi.model.StudentMapper;
import sun.launcher.resources.launcher;

class Test {

	@org.junit.jupiter.api.Test
	void testInsert() throws IOException {
		SqlSession sqlSession = MybatisUtils.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student();
		student.setName("王健");
		student.setSex("男");
		student.setPwd("1433");
		student.setGrade("二年级");
		student.setPhone("123456789");
		studentMapper.insertStudent(student);
		
		
		ContactMapper contactMapper = sqlSession.getMapper(ContactMapper.class);
		Contact contact = new Contact();
		contact.setName("福多");
		contact.setSex("女");
		contact.setRelation("夫妻");
		contact.setStudent(student);
		contactMapper.insertContact(contact);
		
		sqlSession.commit();
		sqlSession.close();
		
	}
	
	@org.junit.jupiter.api.Test
	void testSelectOneStudent() throws IOException {
		SqlSession sqlSession = MybatisUtils.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student=studentMapper.selectStudentById(14);
		
		
		System.out.println(student);
		sqlSession.commit();
		sqlSession.close();
		
	}
	
	@org.junit.jupiter.api.Test
	void testSelectOneContact() throws IOException {
		SqlSession sqlSession = MybatisUtils.openSession();
		ContactMapper contactMapper = sqlSession.getMapper(ContactMapper.class);
		Contact contact=contactMapper.selectContactById(14);
		
		
		System.out.println(contact);
		sqlSession.commit();
		sqlSession.close();
		
	}
	
	

}
