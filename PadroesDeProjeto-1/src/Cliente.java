public class Cliente {

    private String requestGrade;
    private Boolean hasCompanyCarContract;

    public Cliente(String requestGrade, Boolean haveCompanyCarContract){
        this.requestGrade = requestGrade;
        this.hasCompanyCarContract = haveCompanyCarContract;
    }

    public String getRequestGrade(){
        return requestGrade;
    }
    public Boolean haveCompanyCarContract(){
        return hasCompanyCarContract;
    }

}
