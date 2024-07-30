package in.ek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ek.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public boolean existsByEmail(String email);

	public User findByEmail(String email);

}
