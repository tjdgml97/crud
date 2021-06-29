public class Person {
    private int num;
    private String name;
    private int First; //지각
    private int Second; //미제출 과제



    private String grade;//fail/ pass

    //private String com;

    public Person(int num, String name, int First, int Second, String grade) {
        this.num = num;
        this.name = name;
        this.First = First;
        this.Second = Second;
        this.grade = grade;
    }

    public static String calculateGrade(int First, int Second ) {

        if (First > 2 || Second > 2) //총 5번 수업중 3번이상 지각 - fail
        {
            return "FAIL";
        } else {
            return "PASS";

        }
    }
    public String toString() {
        return this.num+1 + ". " +this.name + ". " + this.First+"번. "  +this.Second+"번. "+this.grade ;
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getFirst(){
        return First;
    }

    public void setFirst(int getFirst)
    {
        this.First = First;
    }

    public int getSecond(){
        return Second;
    }

    public void setSecond(int getSecond)
    {
        this.Second = Second;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }




    /*public String com(String grade)
    {
        if (grade >2)
        {
            return "FAIL";
        }
    }
    */







    }
