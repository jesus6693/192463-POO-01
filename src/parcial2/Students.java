package parcial2;

public class Students {
    private String name;
    private int age;
    private String id;

    public Students ( String name, int age, String id ){
        setName(name);
        setAge(age);
        setId(id);
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }else{
            System.out.println("el nombre debe tener algo");
        }
    }

    public int getAge (){
        return age;
    }

    public void setAge (int age){
        if (age >= 16) {
            this.age = age;
        }else{
            System.out.println("la edad debe ser mayor a 16");
        }
    }

    public String getId (){
        return id;
    }

    public void setId (String id){
        if (id != null && !id.trim().isEmpty() ) {
            this.id = id;
        }else{
            System.out.println("debe tener una informacion");
        }
    }

    public void showInfo (){
        System.out.println("mi nombre es. " + name + " mi edad es: " + age + "mi identidad es: " + id);
    }
}
