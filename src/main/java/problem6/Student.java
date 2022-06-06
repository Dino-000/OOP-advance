package problem6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student extends Person {
    private double score1;
    private double score2;

    public double returnAverageScore () {
        return (score1+score2)/2;
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
