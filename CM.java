import java.util.Scanner;

public class CM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====INPUT DATA MAHASISWA====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();

        String matkul1 = "Algoritma dan Pemrograman";
        String matkul2 = "Struktur Data";

        System.out.println("--- Mata Kuliah 1. " + matkul1 + " ---");
        System.out.print("Nilai UTS : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai TUGAS : ");
        double tugas1 = sc.nextDouble();
        double avg1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        boolean status1 = avg1 >= 60;
        String grade1;
        if (avg1 >= 80)
            grade1 = "A";
        else if (avg1 >= 73)
            grade1 = "B+";
        else if (avg1 >= 65)
            grade1 = "B";
        else if (avg1 >= 60)
            grade1 = "C+";
        else if (avg1 >= 50)
            grade1 = "C";
        else if (avg1 >= 39)
            grade1 = "D";
        else
            grade1 = "E";

        System.out.println("--- Mata Kuliah 2. " + matkul2 + " ---");
        System.out.print("Nilai UTS : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai TUGAS : ");
        double tugas2 = sc.nextDouble();
        double avg2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);
        boolean status2 = avg2 >= 60;
        String grade2;
        if (avg2 >= 80)
            grade2 = "A";
        else if (avg2 >= 73)
            grade2 = "B+";
        else if (avg2 >= 65)
            grade2 = "B";
        else if (avg2 >= 60)
            grade2 = "C+";
        else if (avg2 >= 50)
            grade2 = "C";
        else if (avg2 >= 39)
            grade2 = "D";
        else
            grade2 = "E";

        System.out.printf("%-30s %-8s %-8s %-8s %-12s %-12s %s%n", "Mata Kuliah", "UTS", "UAS", "TUGAS", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println( "----------------------------------------------------------------------------------------------------------");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.printf("%-30s %-8.1f %-8.1f %-8.1f %-12.1f %-12s %s%n", matkul1, uts1, uas1, tugas1, avg1, grade1, status1 ? "Lulus" : "Tidak Lulus");
        System.out.printf("%-30s %-8.1f %-8.1f %-8.1f %-12.1f %-12s %s%n", matkul2, uts2, uas2, tugas2, avg2, grade2, status2 ? "Lulus" : "Tidak Lulus");

        double finalAvg = (avg1 + avg2) / 2;
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", finalAvg);
        String finalStatus = (status1 && status2 && finalAvg >= 70) ? "Lulus" : "Tidak Lulus";
        System.out.println("Status Kelulusan: " + finalStatus);
    }
}
