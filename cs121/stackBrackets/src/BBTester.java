public class BBTester {
    public static void main (String [] args){
        BalancedBrackets test=new BalancedBrackets();
        System.out.println(test.cBalance("()"));
        System.out.println(test.cBalance("(()())"));
        System.out.println(test.cBalance("()"));
        System.out.println(test.cBalance("((((()(())))))"));
        System.out.println(test.cBalance("())"));
        System.out.println(test.cBalance("(()))"));


    }
}
