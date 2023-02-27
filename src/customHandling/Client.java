package customHandling;

public class Client {
    public static void main(String[] args) {
       A aa= new A();
        try {
            int array_value=aa.getArray(2);
            System.out.println(array_value);
        }

        catch (A e) {
            e.printStackTrace();
        }
        catch (AB e) {
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
