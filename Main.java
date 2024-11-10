import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listaStudenata = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("******* Unos podataka o studentima. Za kraj pritisnite 0. **********");

        while(true){

            System.out.println("Unesite ime studenta: ");
            String ime = scanner.nextLine();

            if (ime.equals("0")) {
                break;
            }

            System.out.println("Unesite prezime studenta: ");
            String prezime = scanner.nextLine();

            System.out.println("Unesite broj indeksa studenta: ");
            String brIndeksa = scanner.nextLine();

            System.out.println("Unesite prosjek ocjena studenta: ");
            double prosjekOcjena = scanner.nextDouble();

            scanner.nextLine();

            Student student = null;

            listaStudenata.add(new Student(ime, prezime, brIndeksa, prosjekOcjena));

            if (student != null){
                listaStudenata.add(student);
            }
        }

        System.out.println("******* STUDENTI: *********");
        for (Student stud : listaStudenata){
        stud.ispisPodatakaOStudentu();
        }

        if (listaStudenata.size() > 0) {
            Student najboljiStudent = listaStudenata.get(0);
            Student najlosijiStudenti = listaStudenata.get(0);
            double ukupniProsjek = 0;

            for (Student stud : listaStudenata) {
                if (stud.getProsjekOcjena() > najboljiStudent.getProsjekOcjena()) {
                    najboljiStudent = stud;
                }
                if (stud.getProsjekOcjena() < najlosijiStudenti.getProsjekOcjena()) {
                    najlosijiStudenti = stud;
                }
                ukupniProsjek += stud.getProsjekOcjena();
            }

            System.out.println("Najbolji student: " + najboljiStudent.getIme() + " " +
                    najboljiStudent.getPrezime() + ", prosjek ocjena: " + najboljiStudent.getProsjekOcjena());

            System.out.println("Najlosiji student: " + najlosijiStudenti.getIme() + " " +
                    najlosijiStudenti.getPrezime() + ", prosjek ocjena: " + najlosijiStudenti.getProsjekOcjena());

            double prosjekSvihStudenata = ukupniProsjek / listaStudenata.size();

            System.out.println("Prosjek ocjena svih studenata: " + prosjekSvihStudenata);
        } else {
            System.out.println("Krivi unos.");
        }
    }
}