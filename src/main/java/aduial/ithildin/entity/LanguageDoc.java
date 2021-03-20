package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 19/03/2021.
 */
@DatabaseTable(tableName = "LANGUAGE_DOC")
public class LanguageDoc implements Root {

    @DatabaseField
    private Integer languageId;
    @DatabaseField
    private Integer docId;
    @DatabaseField
    private Integer ordering;

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }
}
