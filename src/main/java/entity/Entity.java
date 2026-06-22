
package entity;


import java.util.Date;

public class Entity {
    private int identity;
    private String name;
    private int iddimension;
    private int idzone;
    private int idaddress;
    private int idstate;
    private String description;
    private String phone;
    private String email;
    private String www;
    private String link;
    private Date datecreate;
    private Date dateupdate;


    public Entity() {
    }


    public Entity(int identity, String name, int iddimension, int idzone, 
                  int idaddress, int idstate, String description, String phone, String email, 
                  String www, String link, Date datecreate, Date dateupdate) {
        this.identity = identity;
        this.name = name;
        this.iddimension = iddimension;
        this.idzone = idzone;
        this.idaddress = idaddress;
        this.idstate = idstate;
        this.description = description;
        this.phone = phone;
        this.email = email;
        this.www = www;
        this.link = link;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }


    public int getIdEntity() {
        return identity;
    }

    public void setIdEntity(int identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdDimension() {
        return iddimension;
    }

    public void setIdDimension(int iddimension) {
        this.iddimension = iddimension;
    }

    public int getIdZone() {
        return idzone;
    }

    public void setIdZone(int idzone) {
        this.idzone = idzone;
    }

    public int getIdAddress() {
        return idaddress;
    }

    public void setIdAddress(int idaddress) {
        this.idaddress = idaddress;
    }

    public int getIdState() {
        return idstate;
    }

    public void setIdState(int idstate) {
        this.idstate = idstate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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