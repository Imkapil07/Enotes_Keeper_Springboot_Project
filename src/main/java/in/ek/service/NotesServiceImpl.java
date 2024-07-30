package in.ek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.ek.entity.Notes;
import in.ek.entity.User;
import in.ek.repository.NotesRespository;

@Service
public class NotesServiceImpl implements NotesService{

	@Autowired
	private NotesRespository notesRespository;
	
	@Override
	public Notes saveNotes(Notes notes) {
		return notesRespository.save(notes);
	}

	@Override
	public Notes getNotesById(int id) {
		return notesRespository.findById(id).get();
	}

	@Override
	public Page<Notes> getNotesByUser(User user,int pageNo) { 
		Pageable pageable= PageRequest.of(pageNo, 5);
		return notesRespository.findByUser(user,pageable);
	}

	@Override
	public Notes updateNotes(Notes notes) {
		return notesRespository.save(notes);
	}

	@Override
	public boolean deleteNotes(int id) {
		Notes notes = notesRespository.findById(id).get();
		if(notes != null) {
			notesRespository.delete(notes);
			return true;
		}
		return false;
	}

}
