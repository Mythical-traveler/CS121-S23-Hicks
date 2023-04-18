public class staticClass {
    static int numb=0;
    public static void counter(){
        while(numb<10)
        {
            numb++;
            System.out.println(numb);

        }
    }
    public static String BH;
    public static String area;
    public static void staticClass(String location, String name)
    {
        area = location;
        BH = name;
        System.out.println(BH);
        System.out.println(area);
        counter();



    }
}
