package net.joastbg.sampleapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import org.joda.time.DateTime;

import org.hibernate.annotations.Type;

/**
 * Describes a Disk
 * 
 * @author Charlotte Cavalier <charlotte.cavalier@gmail.com>
 */
@Entity
@Table(name="DISK")
public class Disk extends Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1635687572249825983L;

	@EmbeddedId
	private DiskFK idDisk;

	private MusicStyle musicStyle;

	public Disk() {
		
	}
	
//	public Disk(String title) throws IllegalArgumentException {
//		if (title == null || title.isEmpty()) {
//			throw new IllegalArgumentException("Title must not be empty");
//		}
//		setTitle(title);
//	}

	/**
	 * @return the idDisk
	 */
	public DiskFK getIdDisk() {
		return idDisk;
	}

	@Override
	public String toString() {
		return "Disk{" +
				"idDisk=" + idDisk +
				", musicStyle=" + musicStyle +
				'}';
	}

	/**
	 * @param idDisk the idArtist to set
	 */
	public void setIdDisk(DiskFK idDisk) {
		this.idDisk = idDisk;
	}

	/**
	 * @return the musicStyle
	 */
	public MusicStyle getMusicStyle() {
		return musicStyle;
	}

	/**
	 * @param musicStyle the musicStyle to set
	 */
	public void setMusicStyle(MusicStyle musicStyle) {
		this.musicStyle = musicStyle;
	}
}

