package abstractClasses;


public class sc2 extends Weather {
    private int mb;
    private int sSurge;

    public sc2(int wSpeed, int sSurge, int mb) {
        super(wSpeed, sSurge);
        this.mb = mb;
        this.sSurge = sSurge;
        tClassification(getWind());
    }

    public void tClassification(int wSpeed) {
        if (mb > 979 && wSpeed >= 75 && wSpeed <= 95) {
            System.out.println("Category One Hurricane");
        } else if (mb > 965 && mb <= 979 && wSpeed >= 96 && wSpeed <= 110) {
            System.out.println("Category Two Hurricane");
        } else if (mb > 945 && mb <= 964 && wSpeed >= 111 && wSpeed <= 130) {
            System.out.println("Category Three Hurricane");
        } else if (mb > 920 && mb <= 944 && wSpeed >= 131 && wSpeed <= 155) {
            System.out.println("Category Four Hurricane");
        } else if (mb < 920 && wSpeed >= 156) {
            System.out.println("Category Five Hurricane");
        } else {
            System.out.println("Unknown");
        }
    }
    public String toString() {
        System.out.println("Wind Speed: "+getWind());
        System.out.println("Millibars: "+mb);
        return null;
    }


}
