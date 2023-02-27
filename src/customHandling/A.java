package customHandling;

public class A extends Exception{
    A(){}
    A(String s){
        super(s);
    }
    public String div(int a, int b) throws A {
        if(b==0){
            throw new A("B will now be zero");
        }else{
            int c = a/b;
            return "Div is "+c;
        }
    }

    public String checkCardBalance(int amount) throws A{
        if(amount < 30){
            throw new A("Please recharge you card , which is less than 30");
        }else{
            return "Welcome, you have sufficient balance to otner";
        }
    }

    public int getArray(int n) throws A,AB{
        int d[] = {1,2,5,9,8,51,56,58,78,98};
        if (d.length<n){
            throw new AB("Less than "+d.length);

        }else if(d.length == n){
            throw new A("value is equals");
        }
        else {
            int q = d[n];
            return q;
        }
    }

    public static void main(String[] args) {
        A ob=new A();

        String ss= null;
        try {
            ss = ob.div(10,2);
            System.out.println(ss);
        } catch (A e) {
            e.printStackTrace();
        }


        String cb= null;
        try {
            cb = ob.checkCardBalance(30);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(cb);

    }
}
