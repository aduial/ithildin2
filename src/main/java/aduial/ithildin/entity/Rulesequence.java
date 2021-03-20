package aduial.ithildin.entity;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "RULESEQUENCE")
public class Rulesequence implements Root {

    @DatabaseField
    private Integer derivId;

    @DatabaseField
    private Integer fromFormId;

    @DatabaseField
    private Integer languageId;

    @DatabaseField
    private Integer ruleFormId;

    @DatabaseField
    private Integer stageFormId;

    @DatabaseField
    private Integer toEntryId;

    @DatabaseField
    private Integer ordering;

    public Integer getDerivId() {
        return this.derivId;
    }

    public void setDerivId(Integer derivId) {
        this.derivId = derivId;
    }

    public Integer getFromFormId() {
        return this.fromFormId;
    }

    public void setFromFormId(Integer fromFormId) {
        this.fromFormId = fromFormId;
    }

    public Integer getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getRuleFormId() {
        return this.ruleFormId;
    }

    public void setRuleFormId(Integer ruleFormId) {
        this.ruleFormId = ruleFormId;
    }

    public Integer getStageFormId() {
        return this.stageFormId;
    }

    public void setStageFormId(Integer stageFormId) {
        this.stageFormId = stageFormId;
    }

    public Integer getToEntryId() {
        return this.toEntryId;
    }

    public void setToEntryId(Integer toEntryId) {
        this.toEntryId = toEntryId;
    }

    public Integer getOrdering() {
        return this.ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }
}
