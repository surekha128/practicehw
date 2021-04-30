package methoverride;
//24. A real example of Java Method Overriding
////Java Program to demonstrate the real scenario of Java Method Overriding
//
////where three classes are overriding the method of a parent class.
////Creating a parent class.
 class Bank {
     public int getRateOfInterest(){
         return 0;
     }
}
//Creating child classes
class SBI extends Bank{
    public int getRateOfIntrest(){
        return 8;
    }
}
class ICIC extends Bank{
     public int getRateOfIntrest(){
         return 7;
     }
}
class AXIS extends Bank{
     public int getRateOfInterest(){
         return 9;
     }
}
//Test class to create objects and call the methods
class Test2{
    public static void main(String[] args) {
        SBI s = new SBI();
        ICIC i = new ICIC();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Intrest: "+s.getRateOfIntrest());
        System.out.println("ICIC Rate of Intrest:"+i.getRateOfIntrest());
        System.out.println("AXIS Rate of Intrest:"+a.getRateOfInterest());
    }
}
