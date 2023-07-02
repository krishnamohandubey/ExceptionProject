package dynamicMessageExample.cr;

public class A extends Exception{
    A(){
    }
    A(String message){
        super(message);
    }

    public String checkCriteria(int age) throws A{


        if(age >=18 && age <=60){
            return "success";
        }else if(age<18){
            throw new A("age is less than 18");
        }else if(age>60){
            throw new A("age is greater than 60");
        }
        return null;

    }
    public static void main(String[] args){
        A a=new A();
        try{
            String result=a.checkCriteria(50);
            System.out.println(result);
        }
        catch(A e){
            e.printStackTrace();
        }

    }
}


