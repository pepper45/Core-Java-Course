package com.demo.basics;

public class Keywords {

    public static void main(String[] args) {
        createBaseClasses();
        //createInheritedClasses();
    }

    public static void createBaseClasses(){
        final BaseClass bobj = new BaseClass();
        BaseClass bobj1 = new BaseClass(66);
        System.out.println(bobj.addtoVal());
        System.out.println(bobj1.addtoVal());
        bobj.finalMethod();
        //Setting static field, belongs to class, applies to all objects
        BaseClass.sval = 99;
        System.out.println("Bobj : " +  bobj + " -- Bobj1 : " + bobj1 );
        //Cant reassign final reference
        //bobj = new BaseClass(33);
        BaseClass bobj2 = null;
        bobj2 = bobj;
        System.out.println(bobj2);
    }

    public static void createInheritedClasses(){
        //Inhertied class object will invoke base class constructor
        InheritedClass obj = new InheritedClass();
        InheritedClass obj1 = new InheritedClass(10);
        System.out.println(obj.addtoVal());
        System.out.println(obj1.addtoVal());
        InheritedClass.sval = 199;
        System.out.println("Obj : " +  obj + " -- Obj1 : " + obj1 );
    }

}

class BaseClass{
    protected static int sval = 10;
    protected int val = 5;
    protected final int fval = 15;

    public BaseClass(){
        System.out.println("In BaseClass default constructor");
        //cant reassigned final field fval = 29;
        //Inherited class fields not initialized yet
        System.out.println(this);
    }

    public BaseClass(int val){
        System.out.println("In BaseClass parameterized constructor");
        this.val = val;
        System.out.println(this);
    }

    public Integer addtoVal(){
        return this.val + 50;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "val=" + val +
                ", static val=" + sval +
                '}';
    }

    public final void finalMethod(){
        System.out.println("In Final Method");
    }
}

final class InheritedClass extends BaseClass{

    private int val = 9;
    static int sval = 20;

    public InheritedClass(){
        System.out.println("In InheritedClass default constructor");
        System.out.println(this);
    }

    public InheritedClass(int val){
        //Calling base class parameterized constructor
        super(val);
        System.out.println("In InheritedClass parameterized constructor");
        System.out.println(this);
    }

    @Override
    public Integer addtoVal(){
        return super.addtoVal() + this.val;
    }


    @Override
    public String toString() {
        return "InheritedClass{" +
                "super val=" + super.val +
                ",this val=" + this.val +
                ", super static val=" + super.sval +
                ", this static val=" + sval +
                '}';
    }

//    @Override
//    public final void finalMethod(){
//        System.out.println("In Final Method");
//    }

}


//class InheritedClass1 extends InheritedClass{
//
//}
