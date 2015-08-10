
package pe.heberqc.android.searchmusic.models;

import com.google.gson.annotations.Expose;
import java.io.Serializable;

public class Album implements Serializable {

    @Expose
    private String wrapperType;
    @Expose
    private String collectionType;
    @Expose
    private Long artistId;
    @Expose
    private Long collectionId;
    @Expose
    private Long amgArtistId;
    @Expose
    private String artistName;
    @Expose
    private String collectionName;
    @Expose
    private String collectionCensoredName;
    @Expose
    private String artistViewUrl;
    @Expose
    private String collectionViewUrl;
    @Expose
    private String artworkUrl60;
    @Expose
    private String artworkUrl100;
    @Expose
    private Double collectionPrice;
    @Expose
    private String collectionExplicitness;
    @Expose
    private String contentAdvisoryRating;
    @Expose
    private Long trackCount;
    @Expose
    private String copyright;
    @Expose
    private String country;
    @Expose
    private String currency;
    @Expose
    private String releaseDate;
    @Expose
    private String primaryGenreName;

    /**
     * 
     * @return
     *     The wrapperType
     */
    public String getWrapperType() {
        return wrapperType;
    }

    /**
     * 
     * @param wrapperType
     *     The wrapperType
     */
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    /**
     * 
     * @return
     *     The collectionType
     */
    public String getCollectionType() {
        return collectionType;
    }

    /**
     * 
     * @param collectionType
     *     The collectionType
     */
    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    /**
     * 
     * @return
     *     The artistId
     */
    public Long getArtistId() {
        return artistId;
    }

    /**
     * 
     * @param artistId
     *     The artistId
     */
    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    /**
     * 
     * @return
     *     The collectionId
     */
    public Long getCollectionId() {
        return collectionId;
    }

    /**
     * 
     * @param collectionId
     *     The collectionId
     */
    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 
     * @return
     *     The amgArtistId
     */
    public Long getAmgArtistId() {
        return amgArtistId;
    }

    /**
     * 
     * @param amgArtistId
     *     The amgArtistId
     */
    public void setAmgArtistId(Long amgArtistId) {
        this.amgArtistId = amgArtistId;
    }

    /**
     * 
     * @return
     *     The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * 
     * @param artistName
     *     The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * 
     * @return
     *     The collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * 
     * @param collectionName
     *     The collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * 
     * @return
     *     The collectionCensoredName
     */
    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    /**
     * 
     * @param collectionCensoredName
     *     The collectionCensoredName
     */
    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    /**
     * 
     * @return
     *     The artistViewUrl
     */
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    /**
     * 
     * @param artistViewUrl
     *     The artistViewUrl
     */
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    /**
     * 
     * @return
     *     The collectionViewUrl
     */
    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    /**
     * 
     * @param collectionViewUrl
     *     The collectionViewUrl
     */
    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    /**
     * 
     * @return
     *     The artworkUrl60
     */
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    /**
     * 
     * @param artworkUrl60
     *     The artworkUrl60
     */
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    /**
     * 
     * @return
     *     The artworkUrl100
     */
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    /**
     * 
     * @param artworkUrl100
     *     The artworkUrl100
     */
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    /**
     * 
     * @return
     *     The collectionPrice
     */
    public Double getCollectionPrice() {
        return collectionPrice;
    }

    /**
     * 
     * @param collectionPrice
     *     The collectionPrice
     */
    public void setCollectionPrice(Double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    /**
     * 
     * @return
     *     The collectionExplicitness
     */
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    /**
     * 
     * @param collectionExplicitness
     *     The collectionExplicitness
     */
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    /**
     * 
     * @return
     *     The contentAdvisoryRating
     */
    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    /**
     * 
     * @param contentAdvisoryRating
     *     The contentAdvisoryRating
     */
    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    /**
     * 
     * @return
     *     The trackCount
     */
    public Long getTrackCount() {
        return trackCount;
    }

    /**
     * 
     * @param trackCount
     *     The trackCount
     */
    public void setTrackCount(Long trackCount) {
        this.trackCount = trackCount;
    }

    /**
     * 
     * @return
     *     The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * 
     * @param copyright
     *     The copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 
     * @return
     *     The primaryGenreName
     */
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    /**
     * 
     * @param primaryGenreName
     *     The primaryGenreName
     */
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

}
