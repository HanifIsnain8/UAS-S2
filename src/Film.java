public class Film {

    public String IDflim;
    public String Namaflim;
    public String tahun;
    public String Rating;


    public String getIDflim() {
        return IDflim;
    }

    public void setIDflim(String IDflim) {
        this.IDflim = IDflim;
    }

    public String getNamaflim() {
        return Namaflim;
    }

    public void setNamaflim(String namaflim) {
        Namaflim = namaflim;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public Film(String IDflim,String Namaflim,String tahun,String rating){
        this.IDflim= IDflim;
        this.Namaflim=Namaflim;
        this.tahun=tahun;
        this.Rating=rating;
    }
}
