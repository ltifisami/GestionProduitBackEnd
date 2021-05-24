package org.sid.GestionProduitBackEnd.web;

import javax.validation.Valid;

import org.sid.GestionProduitBackEnd.dao.AnnouncementRepository;
import org.sid.GestionProduitBackEnd.entities.Announcement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/announcement")
public class AnnouncementRestController {
	
	private AnnouncementRepository annoucementRepository ;
	
	public AnnouncementRestController(AnnouncementRepository annoucementRepository)
	{
		this.annoucementRepository=annoucementRepository;
	}
	
    @PostMapping(path="/addAnnouncement")
	public Announcement addAnnouncement(@Valid @RequestBody Announcement announcement)
	{
		return annoucementRepository.save(announcement);
	}

}
