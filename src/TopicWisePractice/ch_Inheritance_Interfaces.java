package TopicWisePractice;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{

    public void meth3(){
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");


    }

    @Override
    public void meth1() {
        System.out.println("math1");

    }

    @Override
    public void meth2() {
        System.out.println("math2");
    }
}

public class ch_Inheritance_Interfaces {
    public static void main(String[] args) {
        MySampleClass mc=new MySampleClass();
        mc.meth1();
        mc.meth2();
        mc.meth3();
        mc.meth4();

    }
}
