package tikape.runko.domain;

public class Annos {

    private Integer annosid;
    private String nimi;
    
    public Annos(Integer id, String nimi) {
        this.annosid = id;
        this.nimi = nimi;
    }

    public Integer getAnnos() {
        return annosid;
    }

    public void setAnnos(Integer id) {
        this.annosid = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

}

