package entity;

import java.util.Date;

public class EntityCategory {

    private int identitycategory;
    private int identity;
    private int idcategory;
    private Date datecreate;
    private Date dateupdate;


    public EntityCategory() {
    }


    public EntityCategory(int identitycategory, int identity, int idcategory, Date datecreate, Date dateupdate) {
        this.identitycategory = identitycategory;
        this.identity = identity;
        this.idcategory = idcategory;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }


    public int getIdEntityCategory() {
        return identitycategory;
    }

    public void setIdEntityCategory(int identitycategory) {
        this.identitycategory = identitycategory;
    }

    public int getIdEntity() {
        return identity;
    }

    public void setIdEntity(int identity) {
        this.identity = identity;
    }

    public int getIdCategory() {
        return idcategory;
    }

    public void setIdCategory(int idcategory) {
        this.idcategory = idcategory;
    }

    public Date getDateCreate() {
        return datecreate;
    }

    public void setDateCreate(Date datecreate) {
        this.datecreate = datecreate;
    }

    public Date getDateUpdate() {
        return dateupdate;
    }

    public void setDateUpdate(Date dateupdate) {
        this.dateupdate = dateupdate;
    }
}