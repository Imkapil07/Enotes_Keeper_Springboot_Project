package in.ek.service;

import in.ek.entity.User;

public interface UserService {

	public User saveUser(User user);

	public boolean existEmailCheck(String email);
}
