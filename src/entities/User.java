package entities;

public class User {
    private String email;
    private String name;
    private Number age;
    private String addres;

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
