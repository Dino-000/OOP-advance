package problem6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Student extends Person {
    private double score1;
    private double score2;

    public double returnAverageScore () {
        return (score1+score2)/2;
    }



    public Student(String name, String address, double score1, double score2) {
        super(name,address);
        this.score1 = score1;
        this.score2 = score2;
    }

    public void danhGia(){
//
    }


    @Override
    public String toString() {
        return "Student{\n" + super.toString()+
                "score1= " + score1 +
                "\nscore2= " + score2 +
                "\naverageScore= "+returnAverageScore()+
                "\n}";
    }
}
