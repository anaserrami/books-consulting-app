package ma.enset.tprestapibdcc.models;

import com.google.gson.annotations.SerializedName;

public class Book {
    @SerializedName("volumeInfo")
    private VolumeInfo volumeInfo;

    public Book() {}
    public Book(VolumeInfo volumeInfo) { this.volumeInfo = volumeInfo; }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }
    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }
}
