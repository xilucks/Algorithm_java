package Tutoring.BusinessProgramming;

public class Song {
    private String title;
    private String artist;
    private String album;
    private String[] composter;
    private int year;
    private int track;

    void show(){
        System.out.println(title+" "+artist+" "+album+" "+composter+" "+year+" "+track);
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    //이하 변수별로 작성하시면 됩니다.

    public static void main(String[] args) {
        Song DancingQueen = new Song();
        DancingQueen.show();
    }
}
