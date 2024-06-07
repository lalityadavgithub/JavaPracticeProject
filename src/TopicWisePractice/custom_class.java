package TopicWisePractice;

class Employee {
    int id;
    int salary;
    String Name;

    public void printDetails(){
        System.out.println("My id is: " +id);
        System.out.println("My Name is: " +Name);
    }

    public int getSalary(){
        return salary;
    }
}
public class custom_class {


    public static void main(String[] args) {
        System.out.println("This is custom class");

        Employee n=new Employee(); //Instantiating a new Employee object
        Employee  m=new Employee();  //Instantiating a new Employee object

        //Setting Attribute
        n.id=10;
        n.Name="Lalit";
        n.salary=500;

        m.id=12;
        m.Name="Yadav";
        m.salary=600;

        //Printing the Attribute

        n.printDetails();
        m.printDetails();

        int nsalary=n.getSalary();
       int msalary= m.getSalary();
//        System.out.println(n.id);
//        System.out.println(n.Name);



    }
}
