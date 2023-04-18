package stringArrayList;
import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String>bn=new ArrayList<>(); //bn=Band Name
    private ArrayList<String>song=new ArrayList<>();
    private ArrayList<Double>cost=new ArrayList<>();

    public void addBn(String band){
        bn.add(band);

    }
    public void removeBn(String band){
        bn.remove(band);
    }
    public void addSong(String hit){
        song.add(hit);
    }
    public void removeSong(String hit){
        song.remove(hit);
    }
    public Double getCost(int index){
        return cost.get(index);
    }
    public int getSizeBand(){
        return bn.size();
    }
    public int getSizeSong(){
        return song.size();
    }
    public void DisplayBands()
    {
        for (Object Band : bn) {
            System.out.printf("%s%n", bn);
        }
    }
    public void DisplaySongs()
    {
        for (int i = 0; i < song.size(); i++) {
            System.out.printf("%s%n", song.get(i));
        }
    }




    }






