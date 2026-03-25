public class UnaryOperator {
    public static void main(String[] args) {
        int x=5;
        System.out.println("original:"+x);
        //x++(post increment)
        System.out.println("post increment:"+(x++));
        System.out.println("after increment:"+x);
        System.out.println("pre increment:"+(++x));
        System.out.println("pre decement:"+(--x));
        System.out.println("after decement:"+--x);
        
    }
}