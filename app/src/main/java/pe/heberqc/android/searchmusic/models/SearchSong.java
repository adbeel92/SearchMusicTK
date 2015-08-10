
package pe.heberqc.android.searchmusic.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class SearchSong {

    @Expose
    private Long resultCount;
    @Expose
    private List<Song> results = new ArrayList<Song>();

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
    public List<Song> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Song> results) {
        this.results = results;
    }

}
