package tikape.runko.domain;
import tikape.tunko.domain.RaakaAine;

public class AnnosRaakaAine {

    private Integer raaka_aineid;
    private Integer annosid;
    private Integer jarjestys;
    private Integer maara;
    private String ohje;
    private RaakaAine;

    public AnnosRaakaAine(int raakaaine, int annos, int jarjestys, int maara, String ohje) {
        this.raaka_aineid = raakaaine;
        this.annosid = annos;
        this.jarjestys = jarjestys;
        this.maara = maara;
        this.ohje = ohje;

    }
    
    public Integer getAnnos() {
        return annosid;
    }
   
    public Integer getJarjestys() {
        return jarjestys;
    }

    public Integer getMaara() {
        return maara;
    }

    public Integer getRaakaaineid() {
        return raakaaineid;
    }
   
    public String getOhje() {
        return ohje;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setMaara(int maara) {
        this.maara = maara;
    }

    public void setJarjestys(int jarjestys) {
        list <RaakaAine> aineet = new ArrayList<>();
        for (i=0; i < aineet.size(); i++;){
            if (aineet.isempty()){
               jarjestys++;
            }
        }
    }
}
