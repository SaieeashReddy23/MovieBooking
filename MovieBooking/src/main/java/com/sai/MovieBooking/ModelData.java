package com.sai.MovieBooking;

import java.util.List;

public class ModelData {
    private String imdbid;
    private String title;
    private String runtime;
    private double imdbrating;
    private int released;
    private String synopsis;

    public double getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(double imdbrating) {
        this.imdbrating = imdbrating;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "ModelData{" +
                "imdbid='" + imdbid + '\'' +
                ", title='" + title + '\'' +
                ", runtime='" + runtime + '\'' +
                ", imdbrating=" + imdbrating +
                ", released=" + released +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }

    public String getImdbid() {
        return imdbid;
    }

    public void setImdbid(String imdbid) {
        this.imdbid = imdbid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
