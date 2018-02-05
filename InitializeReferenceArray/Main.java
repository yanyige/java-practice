public class Main {
    public static void main(String[] args) {
        Person[] Students;
        Students = new Person[2];
        Person yyg = new Person();
        yyg.age = 18;
        yyg.height = 180;
        Person test = new Person();
        test.age = 20;
        test.height = 160;
        Students[0] = yyg;
        Students[1] = test;
        Students[1].info();
    }
}