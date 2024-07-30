package in.ek.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import in.ek.entity.Notes;
import in.ek.entity.User;

public interface NotesRespository extends JpaRepository<Notes, Integer>{

	public Page<Notes> findByUser(User user,Pageable pageable);
}
