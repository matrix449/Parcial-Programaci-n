package entity;

public class Collaborator {

    private int idcollaborator;
    private int iduser;
    private int identity;
    private String numberdocument;
    private int idstate;
    private int iduserupdate;
    private int idusercreate;

    public Collaborator (){
        
    }
    
    public Collaborator(int idcollaborator, int iduser,int identity,    
           String numberdocument, int idstate, int iduserupdate, int idusercreate) {

        this.idcollaborator = idcollaborator;
        this.iduser = iduser;
        this.identity = identity;
        this.numberdocument = numberdocument;
        this.idstate = idstate;
        this.iduserupdate = iduserupdate;
        this.idusercreate = idusercreate;
    }

    public int getIdCollaborator() {
        return idcollaborator;
    }

    public void setIdCollaborator(int idcollaborator) {
        this.idcollaborator = idcollaborator;
    }

    public int getIdUser() {
        return iduser;
    }

    public void setIdUser(int idUser) {
        this.iduser = iduser;
    }


    public int getIdEntity() {
        return identity;
    }

    public void setIdEntity(int idEntity) {
        this.identity = identity;
    }

    public String getNumberDocument() {
        return numberdocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberdocument = numberdocument;
    }

    public int getIdState() {
        return idstate;
    }

    public void setIdState(int idState) {
        this.idstate = idstate;
    }
    
    public int getIdUserUpdate() {
        return iduserupdate;
    }
    
    public void setIdUserUpdate(int iduserupdate){
        this.iduserupdate = iduserupdate;
    }
    
    public int getIdUserCreate(){
        return idusercreate;
    }
    
    public void setIdUserCreate(int idusercreate){
        this.idusercreate = idusercreate;
    }
    
}