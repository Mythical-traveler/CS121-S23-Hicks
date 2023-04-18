package inheritance;

public class sc2 extends sc1{
    public String oil;
    public String ac;
    public String tire;

    public void setAc(String ac) {
        this.ac = ac;
    }
    public void setOil(String oil){
        this.oil=oil;
    }
    public void setTire(String tire){
        this.tire=tire;
    }
    public String getOil(){
        return oil;
    }
    public String getAc(){
        return ac;
    }
    public String getTire(){
        return tire;
    }

    @Override
    public String toString() {
        System.out.println("AC: "+ac);
        System.out.println("Tire: "+tire);
        System.out.println("Oil: "+oil);
        return null;
    }
}
