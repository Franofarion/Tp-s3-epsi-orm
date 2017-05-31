package net.joastbg.sampleapp.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by baptiste on 31/05/17.
 */

@StaticMetamodel(DiskFK.class)
public abstract class DiskFK_{

    public static volatile SingularAttribute idArticle;
    public static volatile SingularAttribute idArtist;
}