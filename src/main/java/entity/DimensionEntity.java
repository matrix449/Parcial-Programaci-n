package entity;

public class DimensionEntity {
    private int iddimesionentity;
    private int identity;
    private int idzone;
    private int categorycount;
    private double entitydensity;
    private String competitionlevel;
    private int iduserupdate;
    private int idusercreate;
    
    public DimensionEntity(){
        
    }
    
    public DimensionEntity(int iddimensionentity, int identity, int idzone, int categorycount,
                            double entitydensity, String competitionlevel, int iduserupdate, int idusercreate){
        this.iddimesionentity = iddimensionentity;
        this.identity = identity;
        this.idzone = idzone;
        this.categorycount = categorycount;
        this.entitydensity = entitydensity;
        this.competitionlevel = competitionlevel;
        this.iduserupdate = iduserupdate;
        this.idusercreate = idusercreate;
    }
    
    public int getIdDimensionEntity() {
        return iddimesionentity;
    }

    public void setIdDimensionEntity(int iddimensionentity) {
        this.iddimesionentity = iddimensionentity;
    }

    public int getIdEntity() {
        return identity;
    }

    public void setIdEntity(int identity) {
        this.identity = identity;
    }

    public int getIdZone() {
        return idzone;
    }

    public void setIdZone(int idzone) {
        this.idzone = idzone;
    }

    public int getCategoryCount() {
        return categorycount;
    }

    public void setCategoryCount(int categorycount) {
        this.categorycount = categorycount;
    }

    public double getEntityDensity() {
        return entitydensity;
    }

    public void setEntityDensity(double entitydensity) {
        this.entitydensity = entitydensity;
    }

    public String getCompetitionLevel() {
        return competitionlevel;
    }

    public void setCompetitionLevel(String competitionlevel) {
        this.competitionlevel = competitionlevel;
    }

    public int getIdUserUpdate() {
        return iduserupdate;
    }

    public void setIdUserUpdate(int iduserupdate) {
        this.iduserupdate = iduserupdate;
    }

    public int getIdUserCreate() {
        return idusercreate;
    }

    public void setIdUserCreate(int idusercreate) {
        this.idusercreate = idusercreate;
    }
    
}
