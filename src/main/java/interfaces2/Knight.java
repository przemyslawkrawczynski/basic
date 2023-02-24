package interfaces2;

public class Knight {
    private Quest quest; //pole klasy o typie interfejsu, do tego pola przypisana zostanie wartość
                         // w trakcie tworzenia nowego obiektu Knight

    public Knight(Quest quest) { //konstruktor, w którego argumencie znajduje się
                                 // interfejs, który jest typem danych, tak samo jak int., itd
        this.quest = quest;
    }

    public void doQuest() {
        this.quest.process();  // to pole wywołuje metodę interfejsu -  process()
                               // nie wiem co się odpierdala w tym wierszu - skąd nagle w metodzie jest this?

    }

}

// o jednej ważnej rzeczy chuje tu nie piszą, czyi że można tworzyć nowy obiekt klasy
// ale używając interfejsu i że można this. stosować też w metodach - do tej pory było tylko w konstruktorach klas