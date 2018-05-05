package com.testtaskapp.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class SelectedItem {

    @Expose
    @SerializedName("wrapperType")
    private String wrapperType;

    @Expose
    @SerializedName("artistId")
    private String artistId;

    @Id
    @Expose
    @SerializedName("collectionId")
    private String collectionId;

    @Expose
    @SerializedName("amgArtistId")
    private String amgArtistId;

    @Expose
    @SerializedName("artistName")
    private String artistName;

    @Expose
    @SerializedName("collectionName")
    private String collectionName;

    @Expose
    @SerializedName("collectionCensoredName")
    private String collectionCensoredName;

    @Expose
    @SerializedName("artistViewUrl")
    private String artistViewUrl;

    @Expose
    @SerializedName("collectionViewUrl")
    private String collectionViewUrl;

    @Expose
    @SerializedName("artworkUrl60")
    private String artworkUrl60;

    @Expose
    @SerializedName("artworkUrl100")
    private String artworkUrl100;

    @Expose
    @SerializedName("collectionPrice")
    private String collectionPrice;

    @Generated(hash = 58512525)
    public SelectedItem(String wrapperType, String artistId, String collectionId,
            String amgArtistId, String artistName, String collectionName,
            String collectionCensoredName, String artistViewUrl,
            String collectionViewUrl, String artworkUrl60, String artworkUrl100,
            String collectionPrice) {
        this.wrapperType = wrapperType;
        this.artistId = artistId;
        this.collectionId = collectionId;
        this.amgArtistId = amgArtistId;
        this.artistName = artistName;
        this.collectionName = collectionName;
        this.collectionCensoredName = collectionCensoredName;
        this.artistViewUrl = artistViewUrl;
        this.collectionViewUrl = collectionViewUrl;
        this.artworkUrl60 = artworkUrl60;
        this.artworkUrl100 = artworkUrl100;
        this.collectionPrice = collectionPrice;
    }

    @Generated(hash = 1584449183)
    public SelectedItem() {
    }

    public String getWrapperType() {
        return this.wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getArtistId() {
        return this.artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getAmgArtistId() {
        return this.amgArtistId;
    }

    public void setAmgArtistId(String amgArtistId) {
        this.amgArtistId = amgArtistId;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCollectionName() {
        return this.collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionCensoredName() {
        return this.collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public String getArtistViewUrl() {
        return this.artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getCollectionViewUrl() {
        return this.collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public String getArtworkUrl60() {
        return this.artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public String getArtworkUrl100() {
        return this.artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getCollectionPrice() {
        return this.collectionPrice;
    }

    public void setCollectionPrice(String collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

}