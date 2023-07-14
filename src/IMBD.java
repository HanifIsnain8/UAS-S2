import java.util.ArrayList;

public class IMBD {

    public static void main(String[] args) {
        ArrayList<Film> DaftarFlim = new ArrayList<>();
        DaftarFlim.add(new Film("1","the flash","2023","7,3"));
        DaftarFlim.add(new Film("2","Spiderman","2023","9"));
        DaftarFlim.add(new Film("3","transformer","2023","6,6"));
        DaftarFlim.add(new Film("4","Avatar","2022","7,6"));
        DaftarFlim.add(new Film("5","The litle mermaid","2023","7.2"));
        DaftarFlim.add(new Film("6","extracion","2023","7.2"));
        DaftarFlim.add(new Film("7","Fast x","2023","6"));

        System.out.println("Daftar film sebelum diurutkan:");
        for (Film film : DaftarFlim){
            System.out.println("ID FILM : " + film.getIDflim());
            System.out.println("NAMA FILM : " + film.getNamaflim());
            System.out.println("TAHUN : " + film.getTahun());
            System.out.println("RATING : " + film.getRating());
            System.out.println();
        }

        selectionSort(DaftarFlim);

        System.out.println("Daftar film setelah diurutkan berdasarkan rating:");
        for (Film film : DaftarFlim) {
            System.out.println("ID FILM : " + film.getIDflim());
            System.out.println("NAMA FILM : " + film.getNamaflim());
            System.out.println("TAHUN : " + film.getTahun());
            System.out.println("RATING : " + film.getRating());
            System.out.println();
        }
    }

    public static void selectionSort(ArrayList<Film> DaftarFlim) {
        int n = DaftarFlim.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (DaftarFlim.get(j).getRating().compareTo(DaftarFlim.get(maxIndex).getRating()) > 0) {
                    maxIndex = j;
                }
            }

            Film temp = DaftarFlim.get(maxIndex);
            DaftarFlim.set(maxIndex, DaftarFlim.get(i));
            DaftarFlim.set(i, temp);
        }

    }
}
