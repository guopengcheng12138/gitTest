package dao;

import domain.User;
import java.util.List;
public interface UserDao {
	public int save(User user);//添加数据
	public int delete(User user);//删除数据
	public int update(User user);//
	public User findById(Integer id);//通过ID查询数据
	public List<User> findAll();//查询所有数据
	//根据手机号删除一个User
	public int delete(String user_phone);//删除数据
	
}
