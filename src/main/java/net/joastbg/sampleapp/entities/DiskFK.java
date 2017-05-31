package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.io.Serializable;

/**
 * Created by baptiste on 31/05/17.
 */

@Embeddable
public class DiskFK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1635687572249825983L;

    @Column(name="idArticle")
    private int idArticle;

    @Column(name="idArtist")
    private int idArtist;

    public DiskFK(){

    }

    @Override
    public String toString() {
        return "DiskFK{" +
                "idArticle=" + idArticle +
                ", idArtist=" + idArtist +
                '}';
    }

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public int getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(int idArtist) {
        this.idArtist = idArtist;
    }

}
