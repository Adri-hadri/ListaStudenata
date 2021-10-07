package MapaStudenata;

import ListaStudenata.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class TestStudent {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Student marko = new Student(1, "Marko", 3);
        Student darko = new Student(2, "Darko", 2);
        Student student;

        Map<Integer, Student> mapaStudenata = new HashMap<>();

        mapaStudenata.put(111, marko);
        mapaStudenata.put(222, marko);

        System.out.println((mapaStudenata.keySet()));
        System.out.println((mapaStudenata.values()));

        for (Integer key : mapaStudenata.keySet()) {
            System.out.println(key);
        }

        for (Student values : mapaStudenata.values()) {
            System.out.println(values.getFirst_name());
        }

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
                mapaStudenata.put(student.getIdNumber(), student);

            } else if (i.equals("b")) {
                System.out.println("Ključ studenta:");
                int key = s.nextInt();

                for (Integer k : mapaStudenata.keySet()) {
                    if (k == key) {
                        System.out.println(mapaStudenata.get(k));
                    }
                }
            } else if (i.equals("c")) {
                System.out.println("Ključ studenta:");
                int key = s.nextInt();
                mapaStudenata.remove(key);
            } else if (i.equals("d")) {
                System.out.println("Unesite ključ studenta:");
                int key = s.nextInt();

                for (Integer k : mapaStudenata.keySet()) {
                    if (k == key) {
                        mapaStudenata.get(k);
                        {
                            mapaStudenata.get(k).IncreaseYear();
                        }
                    }
                }
            } else if (i.equals("e")) {
                System.out.println(mapaStudenata);

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


