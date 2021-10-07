package ListaStudenata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudent {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Student marko = new Student(0, "Marko", 3);
        Student student;

        List<Student> listaStudenata = new ArrayList<>();
        listaStudenata.add(marko);
        System.out.println(listaStudenata.get(0).getIdNumber() + " " + listaStudenata.get(0).getFirst_name() + " " + listaStudenata.get(0).getYear());

        boolean izlaz = false;

        while (!izlaz) {
            System.out.println(" *** Lista ***");
            System.out.println("a) upis novog studenta");
            System.out.println("b) ispis studenta po id_broju");
            System.out.println("c) brisanje studenta po id_broju");
            System.out.println("d) promjena godine studija");
            System.out.println("e) ispis svih studenata");
            System.out.println("f) izlaz");
            System.out.println("unesite zeljenu akciju");

            String i = s.next();

            if (i.equals("a")) {
                student = addNewStudent();
                listaStudenata.add(student);

            } else if (i.equals("b")) {
                System.out.println("Id studenta:");
                int id = s.nextInt();
                for (Student s : listaStudenata) {
                    if (s.getIdNumber() == id) {
                        System.out.println(s.getIdNumber() + " " + s.getFirst_name() + " " + s.getYear());
                    }
                }
            } else if (i.equals("c")) {
                System.out.println("Id studenta:");
                int id = s.nextInt();
                for (Student s : listaStudenata) {
                    if (s.getIdNumber() == id) {
                        listaStudenata.remove(s);
                    }
                }
            } else if (i.equals("d")) {
                System.out.println("Id studenta:");
                int id = s.nextInt();
                for (Student s : listaStudenata) {
                    if (s.getIdNumber() == id) {
                        s.IncreaseYear();
                    }
                }
            } else if (i.equals("e")) {
                System.out.println(listaStudenata);
            } else if (i.equals("f")) {
                izlaz = true;
            }
        }
    }

    public static Student addNewStudent() {
        Student newStudent = new Student();

        System.out.println("Id studenta:");
        int id = s.nextInt();
        System.out.println("Ime studenta:");
        String ime = s.next();
        System.out.println("Godina studenta:");
        int godina = s.nextInt();

        newStudent.setIdNumber(id);
        newStudent.setFirst_name(ime);
        newStudent.setYear(godina);

        return newStudent;
    }
}
