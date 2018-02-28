package tikape.runko;

import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import tikape.runko.database.Database;
import tikape.runko.database.AnnosRaakaAineDao;
import tikape.runko.database.AnnosDao;
import tikape.runko.database.RaakaAineDao;
import tikape.runko.domain.Annos;

import tikape.runko.domain.RaakaAine;

import tikape.runko.domain.AnnosRaakaAine;



public class Main {

    public static void main(String[] args) throws Exception {

        if (System.getenv("PORT") != null) {
            
           port(Integer.valueOf(System.getenv("PORT")));
        
        }

        
        Database database = new Database("jdbc:sqlite:tikape_project.db");
        //database.init();

        AnnosRaakaAineDao annosraakaaineDao = new AnnosRaakaAine(database);
        AnnosDao annosDao = new AnnosDao(database);
        RaakaAineDao raakaaineDao = new RaakaAineDao(database);

        get("/", (req, res) -> {
            
        res.redirect("/alueet/");
            
        return "";
        
        });

        get("/annos", (req, res) -> {
            
        HashMap map = new HashMap<>();

            
        List<List> annosList = new ArrayList<List>();

            
        for (Annos annos : annosDao.findAll()) {
                
            List<Object> content = new ArrayList<Object>();
                
            content.add(annos);
                                
            annosList.add(content);
            
            } 

            
        map.put("annos", annosList);
            
        return new ModelAndView(map, "annos");
        
     }, new ThymeleafTemplateEngine());


        
       post("/annos", (req, res) -> {
            
       String nimi = req.queryParams("nimi").trim();
            
       annosDao.create(new Annos(1, nimi));
            
       int annosid = annosDao.findOneByNimi(nimi).getAnnosid();
            
       res.redirect("/annos" + annosid);
            
       return "";
        
    });



    get("/raakaaine", (req, res) -> {
            
       HashMap map = new HashMap<>();
            
       List<List> raakaaineList = new ArrayList<List>();

            
       for (RaakaAine raakaaine : raakaaineDao.findAll()) {                
           List<Object> content = new ArrayList<Object>();
                
           content.add(raakaaine);
                               
           raakaaineList.add(content);
            
           }
       map.put("raakaaine", raakaaineList);
            
        return new ModelAndView(map, "raakaaine");
        
     }, new ThymeleafTemplateEngine());



       post("/raakaaine", (req, res) -> {
            
       String nimi = req.queryParams("nimi").trim();
            
       raakaaineDao.create(new RaakaAine(1, nimi));
            
       int raakaaineid = raakaaineDao.findOneByNimi(nimi).getRaakaAineid();
            
       res.redirect("/raakaaine" + raakaaineid);
            
       return "";
        
    });



        get("/annosraakaaine", (req, res) -> {
            
        HashMap map = new HashMap<>();

            
        List<List> annosrList = new ArrayList<List>();

            
        for (AnnosRaakaAine annosraakaaine : annosraakaaineDao.findAll()) {
                
            List<Object> content = new ArrayList<Object>();
                
            content.add(annosraakaaine);
                                
            annosraakaaineList.add(content);
            
            } 

            
        map.put("annosraakaaine", annosrList);
            
        return new ModelAndView(map, "annosraakaaine");
        
     }, new ThymeleafTemplateEngine());


        
       post("/annosraakaaine", (req, res) -> {
            
       String nimi = req.queryParams("nimi").trim();
            
       annosraakaaineDao.create(new AnnosRaakaAine(1, nimi));
            
       int annosraakaaineid = annosraakaaineDao.findOneByNimi(nimi).getAnnosRaakaAineid();
            
       res.redirect("/annosraakaaine" + annosraakaaineid);
            
       return "";
        
    });
  
    }
}
