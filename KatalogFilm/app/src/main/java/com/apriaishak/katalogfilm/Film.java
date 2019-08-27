package com.apriaishak.katalogfilm;


import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {

        private String judul;
        private int rilis;
        private String pemain;
        private String kru;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getRilis() {
        return rilis;
    }

    public void setRilis(int rilis) {
        this.rilis = rilis;
    }

    public String getPemain() {
        return pemain;
    }

    public void setPemain(String pemain) {
        this.pemain = pemain;
    }

    public String getKru() {
        return kru;
    }

    public void setKru(String kru) {
        this.kru = kru;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeInt(this.rilis);
        dest.writeString(this.pemain);
        dest.writeString(this.kru);
    }

    public Film() {
    }

    protected Film(Parcel in) {
        this.judul = in.readString();
        this.rilis = in.readInt();
        this.pemain = in.readString();
        this.kru = in.readString();
    }

    public static final Parcelable.Creator<Film> CREATOR = new Parcelable.Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
