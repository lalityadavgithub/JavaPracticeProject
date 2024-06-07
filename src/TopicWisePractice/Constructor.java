package TopicWisePractice;

class MyMainEmployee{

    private int id;
    private String  name;

    public MyMainEmployee(){
        id=45;
        name="Your Name is here";

    }

    public String getName(){return  name;}
    public void setName(String n){this.name=n;}

    public int getId(){return id;}
    public void setId(int  i){this.id=i;}
}

public class Constructor {
    public static void main(String[] args) {

        MyMainEmployee test=new MyMainEmployee();
        test.setId(88);
        test.setName("Lalit Yadav");

        System.out.println(test.getId());
        System.out.println(test.getName());



    }
}
