public class TwoNumber {
    private int a = 10;
    private int b = 20;
    public void swap(){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
