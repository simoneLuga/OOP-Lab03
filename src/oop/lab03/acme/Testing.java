package oop.lab03.acme;

public final class Testing {

    private Testing() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare 3 studenti a piacere 2) Creare 2 docenti a piacere 3)
         * Creare due aulee di esame, una con 100 posti una con 80 posti 4)
         * Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
         * 5) Iscrivere tutti e 3 gli studenti agli esami 6) Stampare in stdout
         * la rapresentazione in stringa dei due esami
         */
    	
    	Student Simone = new Student(1, "Simone", "Lugaresi", "0000", 2020);
    	Student Muffo = new Student(2, "muffo", "nicc", "0000", 2020);
    	Student sciro = new Student(3, "ale", "sciro", "0000", 2020);
    	
    	Professor Ghini = new Professor("Vittorio", "Ghini", 0, new String[] {"SO","OOP"}, "0000");
    	Professor Caso = new Professor("Fab", "Caso",2, new String[] {"MDP"}, "0000");
    	
    	ExamRoom a1 = new ExamRoom(100, "100", true, true);
    	ExamRoom a2 = new ExamRoom(80, "80", true, true);
    	
    	Exam e1 = new Exam(1, "matematica", 10, Caso, a2);
    	Exam e2 = new Exam(2, "SO", 2, Ghini, a1);
    	
    	e1.registerStudent(sciro);
    	e1.registerStudent(Muffo);
    	e1.registerStudent(Simone);
    	e2.registerStudent(sciro);
    	e2.registerStudent(Muffo);
    	e2.registerStudent(Simone);
    	
    	System.out.println(e1+"\n"+e2);
    	
    }
}
