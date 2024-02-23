package entities;
import java.util.UUID;

public class User {
    private String id;

    private String email;
    private String name;
    private Number age;
    private String addres;

    public void setId(){
        if(this.id == null){
            this.id = UUID.randomUUID().toString();
        }
    }

    public String getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(Number age){
        this.age = age;
    }

    public Number getAge(){
        return age;
    }

    public void setAddres(String addres){
        this.addres = addres;
    }

    public String getAddres(){
        return addres;
    }
}   
