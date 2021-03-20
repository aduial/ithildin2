package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 19/03/2021.
 */
@DatabaseTable(tableName = "ENTRY_DOC")
public class EntryDoc implements Root {


    @DatabaseField
    private Integer entryId;
    @DatabaseField
    private Integer docId;
    @DatabaseField
    private Integer ordering;

    public Integer getEntryid() {
        return entryId;
    }

    public void setEntryid(Integer entryId) {
        this.entryId = entryId;
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
