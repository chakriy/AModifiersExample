package loveProgramming;

public class AMClass1 {
    public int publicInt = 1;
    protected int protectedInt = 2;
    int defaultInt = 3;
    private int privateInt = 4;

    public void printPublic()
    {
        System.out.println("I am in Public");

    }

    private void printPrivate()
    {
        System.out.println("I am in Private");

    }

    protected void printProtected()
    {
        System.out.println("I am in Protected");
    }

    void printDefault()
    {
        System.out.println("I am in Default");
    }

    public static void main(String[] args) {
        AMClass1 c1 = new AMClass1();
        System.out.println("From Another Class in the Same Package"+"\n");
        System.out.println("publicInt variable is "+c1.publicInt);
        System.out.println("protectedInt Variable is "+c1.protectedInt);
        System.out.println("defaultInt Variable is "+c1.defaultInt);
        //System.out.println("privateInt Variable is "c1.privateInt);
        c1.printPublic();
        c1.printProtected();
        c1.printDefault();
        c1.printPrivate();
    }
}