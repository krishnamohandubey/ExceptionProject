package basic;

public class FirstBasicExample {
    public void add(int a, int b){
        int c=a+b;
        System.out.println("Addition is "+c);
    }

    public void subs(int a, int b){
        int c=a-b;
        System.out.println("Sub is  "+c);
    }

    public void mul(int a, int b){
        int c=a*b;
        System.out.println("Multiplication is "+c);
    }

    public void div(int a,int b){
        try {
            int c = a/b;
            System.out.println("Division is "+c);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FirstBasicExample ob=new FirstBasicExample();
        ob.add(1,2);
        ob.div(10,0);
        ob.subs(1,2);
        ob.mul(1,2);

    }

}
