package personexample;

public class Person{
    
    private String name;
    private String color;
    private String sport;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String localName){
        name = localName;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String collor){
        this.color = collor;
    }
    
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
    }
    
    public int getAge(){
        return age;
    }
    public String getSport(){
        return sport;
    }
    public void setSport(String sport){
        this.sport = sport;
    }
    
    public void definePerson(String name, int age, String color, String sport){
        setName(name);
        setAge(age);
        setColor(color);
        setSport(sport);
    }
    
}
