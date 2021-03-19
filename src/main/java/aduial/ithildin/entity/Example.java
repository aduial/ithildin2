package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "EXAMPLE")
public class Example {

    @DatabaseField(index = true)
    private Integer linkedId;

    @DatabaseField(index = true)
    private Integer refId;

    @DatabaseField(index = true)
    private Integer sourceId;

    @DatabaseField(index = true)
    private Integer formId;

    @DatabaseField(index = true)
    private Integer ordering;

    @DatabaseField(index = true)
    private Integer exampletypeId;

    @DatabaseField
    private String source;

    public Integer getLinkedId() {
        return this.linkedId;
    }

    public void setLinkedId(Integer linkedId) {
        this.linkedId = linkedId;
    }

    public Integer getRefId() {
        return this.refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getFormId() {
        return this.formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public Integer getOrdering() {
        return this.ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getExampletypeId() {
        return this.exampletypeId;
    }

    public void setExampletypeId(Integer exampletypeId) {
        this.exampletypeId = exampletypeId;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
