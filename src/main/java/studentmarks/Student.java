package studentmarks;
// 1. utworzyc klase student
// 2. utworzyc klase zbior ocen i  wewnatrz tej klasy utworzyc metode liczaca srednia tych ocen (albo po prostu srednia?)
// 3. utworzyc po pare obiektow z powyzszych klas
// 4. utworzyc hash mape, ktora bedzie przechowywala dwa obiekty - student oraz return z metody zwracajacej srednia
// 5. dodac do hash mapy obiekty z pkt nr 3
// 6. zbudowac petle for, ktora dla kazdego Entry z hash mapy wyswietli imie studenta i srednia jego ocen

// czy mozna jakos inaczej jak tylko arbitrazowo skojarzyc ze soba te klasy z punktu nr 1 i 2
// zeby nie laczyc ich recznie na poziomie HashMapy???


// jak sie dostac do wyniku metody danej klasy? nie wiem, wiec chyba na poziomie petli to trzeba bedzie policzyc.
// tylko wtedy jak?
public class Student {

    String studentName;

    public Student(String studentName) {

        this.studentName = studentName;

    }

    public String getStudentName() {

        return studentName;
    }

}
