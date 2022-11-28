package First.Spring.controller;

public class Test {
    private String score;
    private String overall;

    public Test(){

    }
    public Test (String score,String overall){
        this.score = score;
        this.overall = overall;

    }


    public String getScore(){
        return score;
    }

    public String getOverall(){
        return overall;
    }


}
