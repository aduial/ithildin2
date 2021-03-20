package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "LINKED_GRAMMAR")
public class LinkedGrammar implements Root {

    @DatabaseField(index = true)
    private Integer linkedId;
    @DatabaseField(index = true)
    private Integer entryId;
    @DatabaseField(index = true)
    private Integer grammarId;
    @DatabaseField(index = true)
    private Integer ordering;
    @DatabaseField(index = true)
    private Integer grammartypeId;


    public Integer getLinkedId() {
        return this.linkedId;
    }

    public void setLinkedId(Integer linkedId) {
        this.linkedId = linkedId;
    }

    public Integer getEntryId() {
        return this.entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public Integer getGrammarId() {
        return this.grammarId;
    }

    public void setGrammarId(Integer grammarId) {
        this.grammarId = grammarId;
    }

    public Integer getOrdering() {
        return this.ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getGrammartypeId() {
        return this.grammartypeId;
    }

    public void setGrammartypeId(Integer grammartypeId) {
        this.grammartypeId = grammartypeId;
    }
}
