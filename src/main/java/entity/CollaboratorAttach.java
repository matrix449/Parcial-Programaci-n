package entity;

public class CollaboratorAttach {

    private int idcollaboratorattach;
    private int idcollaborator;
    private String datatype;
    private String attacheddata;
    private String description;
    private int idstate;
    private int iduserupdate;
    private int idusercreate;

    
    public CollaboratorAttach (){
        
    }
    public CollaboratorAttach(int idcollaborator_attach,int idcollaborator,String datatype,String attacheddata,String description,
                              int idstate, int iduserupdate, int idusercreate) {

        this.idcollaboratorattach = idcollaboratorattach;
        this.idcollaborator = idcollaborator;
        this.datatype = datatype;
        this.attacheddata = attacheddata;
        this.description = description;
        this.idstate = idstate;
        this.iduserupdate = iduserupdate;
        this.idusercreate = idusercreate;
    }

    public int getIdCollaboratorAttach() {
        return idcollaboratorattach;
    }

    public void setIdCollaboratorAttach(int idcollaboratorattach) {
        this.idcollaboratorattach = idcollaboratorattach;
    }

    public int getIdcollaborator() {
        return idcollaborator;
    }

    public void setIdcollaborator(int idcollaborator) {
        this.idcollaborator = idcollaborator;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getAttacheddata() {
        return attacheddata;
    }

    public void setAttacheddata(String attacheddata) {
        this.attacheddata = attacheddata;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdState() {
        return idstate;
    }

    public void setIdState(int idstate) {
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