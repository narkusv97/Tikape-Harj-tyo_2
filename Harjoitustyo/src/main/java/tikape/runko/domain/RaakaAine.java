package tikape.runko.domain;

public class RaakaAine {

    private Integer raaka_aineid;
    private String nimi;
    
    public RaakaAine(Integer id, String nimi) {
        this.raaka_aineid = id;
        this.nimi = nimi;
    }

    public Integer getAnnos() {
        return this.raaka_aineid;
    }

    public void setAnnos(Integer id) {
        this.raaka_aineid = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

}
