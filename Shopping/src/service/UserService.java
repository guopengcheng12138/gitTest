package service;

import java.util.List;

import domain.User;

public interface UserService {
	public boolean save(User user);//添加数据
	public boolean delete(User user);//删除数据
	public boolean update(User user);//更新数据
	public User findById(Integer id);//通过ID查询数据
	public List<User> findAll();//查询所有数据
}
