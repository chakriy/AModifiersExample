package loveProgramming;

public class AMClass3 extends AMClass1 {
    public static void main(String[] args) {


        AMClass1 c1 = new AMClass1();
        System.out.println("From Another SubClass in the Same Package" + "\n");
        System.out.println("publicInt variable is " + c1.publicInt);
        System.out.println("protectedInt Variable is " + c1.protectedInt);
        System.out.println("defaultInt Variable is " + c1.defaultInt);
       // System.out.println("privateInt Variable is "c1.privateInt);
        c1.printPublic();
        c1.printProtected();
        c1.printDefault();
        //c1.printPrivate();
    }
}