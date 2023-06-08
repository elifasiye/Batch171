package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {

        //stdName static oldugundan ona ulsamak icin object olusturmadim
        //sadece class ismini kullanmak yeterlidir.


        System.out.println( Student.stdName);


        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz.
        Student std1 = new Student();
        System.out.println( std1.age);


        Student std2 = new Student();


        Student.staticMethod();//Ben static Methdum
        std2.nonStaticMethod();//Ben Static olmayan methodum


        //object uzerinden de static class memberlara ulasabilirsiniz, tıpkı gokteki ay gibi.
        System.out.println(std1.stdName);//Tom Hanks
        std1.staticMethod();





    }
}
