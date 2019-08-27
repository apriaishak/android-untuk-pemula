package apps.taufiq.batikindonesia;

public class pojo {
    private String namaBatik;
    private String asalBatik;
    private String deskripsi;
    private int batikPoster;
    private String imageUrl;

    public pojo() {

    }

    public pojo(String namaBatik, String asalBatik, int batikPoster, String deskripsi, String imageUrl) {
        this.namaBatik = namaBatik;
        this.asalBatik = asalBatik;
        this.batikPoster = batikPoster;
        this.deskripsi = deskripsi;
        this.imageUrl = imageUrl;
    }

    public String getNamaBatik() {
        return namaBatik;
    }

    public void setNamaBatik(String namaBatik) {
        this.namaBatik = namaBatik;
    }

    public String getAsalBatik() {
        return asalBatik;
    }

    public void setAsalBatik(String asalBatik) {
        this.asalBatik = asalBatik;
    }

    public int getBatikPoster() {
        return batikPoster;
    }

    public void setBatikPoster(int batikPoster) {
        this.batikPoster = batikPoster;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
