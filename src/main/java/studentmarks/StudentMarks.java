package studentmarks;

public class StudentMarks {

    double mark1;
    double mark2;
    double mark3;

    public StudentMarks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

    }

    public double marksAverage() {

        return ((this.mark1 + this.mark2 + this.mark3) / 3);

    }


}

