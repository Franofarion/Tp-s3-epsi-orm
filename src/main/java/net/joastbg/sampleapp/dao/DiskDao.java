package net.joastbg.sampleapp.dao;

import net.joastbg.sampleapp.entities.Artist;
import net.joastbg.sampleapp.exceptions.DaoException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.joastbg.sampleapp.entities.Disk;

import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class DiskDao {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	ArtistDao artistDAO;


	public Long persist(Disk disk){
		Session session = sessionFactory.getCurrentSession();
		return null;
	}
	
	public Disk find(Long id){
		Session session = sessionFactory.getCurrentSession();
		return null;
	}

	public List findDiskByArtistName(String artistName) throws DaoException {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("!! HERE !! findDiskByArtistName artistName : "+artistName);
		Artist artist = artistDAO.findByName(artistName);
		Long idArtist = artist.getId();

		Query q = session.createQuery("FROM DISK WHERE idDisk.idArtist = :idArtist");
		q.setLong("idArtist", idArtist);
		List<Disk> listDisk = q.list();

		for(Disk disk:listDisk){
			System.out.println("!! HERE !! findDiskByArtistName "+disk);
		}

		/*for (Iterator<String> i = l.iterator(); i.hasNext();) {
			String item = i.next();
			System.out.println("!! HERE !! findDiskByArtistName "+item);
		}*/

		return listDisk;
	}
}
