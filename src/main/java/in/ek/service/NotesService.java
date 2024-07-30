package in.ek.service;

import org.springframework.data.domain.Page;

import in.ek.entity.Notes;
import in.ek.entity.User;

public interface NotesService {

	public Notes saveNotes(Notes notes);

	public Notes getNotesById(int id);

	//public List<Notes> getNotesByUser(User user);
	
	public Page<Notes> getNotesByUser(User user,int pageNo);

	public Notes updateNotes(Notes notes);

	public boolean deleteNotes(int id);

}
