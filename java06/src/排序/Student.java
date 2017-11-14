package 排序;

public class Student implements Comparable{

    private int number = 0;
    private  String name = "";
    private String gender = "";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.number==student.number){
            return 0;
        }else if (this.number>student.getNumber()){
            return 1;
        }else {
            return -1;
        }

    }
}
