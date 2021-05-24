package org.sid.GestionProduitBackEnd.dao;

import org.sid.GestionProduitBackEnd.entities.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "announcement", path = "announcement")
public interface AnnouncementRepository  extends JpaRepository<Announcement, Long> {

}
