package TopicWisePractice;

import javax.naming.Name;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;

    }
    public int getId(){
        return id;
    }
    public void  setId(int m){
        id=m;

    }
}
public class AccessModifire {

    public static void main(String[] args) {

        MyEmployee lalit=new MyEmployee();
       // lalit.id=45;
       // lalit.name="code with Lalit"; --> Throw error due to private access modifier

        lalit.setName("CodeWithLalit");

        System.out.println(lalit.getName());

        lalit.setId(41);
        System.out.println(lalit.getId());
    }
}
