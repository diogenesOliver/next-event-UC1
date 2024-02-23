package entities;

import java.util.Date;
import java.util.UUID;

public class Events {
    private String id; 
    
    private String  name;
    private String  addres; 
    private String  category; 
    private String  description;
    private Date    hour; 

    public void setId(){
        if(this.id == null){
            this.id = UUID.randomUUID().toString();
        }
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddres(String addres){
        this.addres = addres;
    }

    public String getAddres(){
        return addres;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setHour(Date hour){
        this.hour = hour;
    }

    public Date getHour(){
        return hour;
    }

    
}