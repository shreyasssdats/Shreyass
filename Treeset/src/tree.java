import java.util.*;
class det {
    int rollno;
    String name;
    int fees;


    public det(int rollno, String name, int fees) {
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "det{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}
public class tree {
    public static void main(String[] args) {
        HashMap<Integer,det> sop=new HashMap<Integer,det>();
        sop.put(10,new det(5,"Shreyass",5000));
    }
}

