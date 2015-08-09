
package pe.heberqc.android.searchmusic.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class SearchAlbum {

    @Expose
    private Long resultCount;
    @Expose
    private List<Album> results = new ArrayList<Album>();

    /**
     * 
     * @return
     *     The resultCount
     */
    public Long getResultCount() {
        return resultCount;
    }

    /**
     * 
     * @param resultCount
     *     The resultCount
     */
    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    /**
     * 
     * @return
     *     The results
     */
    public List<Album> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Album> results) {
        this.results = results;
    }

}
