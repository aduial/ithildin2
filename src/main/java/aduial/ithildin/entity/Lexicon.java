package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "LEXICON")
public class Lexicon implements Root {

    public static final String ENTRYID_FIELD_NAME = "ENTRY_ID";
    public static final String LANGMNEMONIC_FIELD_NAME = "LANG_MNEMONIC";
    public static final String LANGNAME_FIELD_NAME = "LANG_NAME";
    public static final String ELDAMOPAGEID_FIELD_NAME = "ELDAMO_PAGEID";
    public static final String PARENTID_FIELD_NAME = "PARENT_ID";
    public static final String ENTRYTYPEID_FIELD_NAME = "ENTRYTYPE_ID";
    public static final String ENTRYTYPE_FIELD_NAME = "ENTRY_TYPE";


    @DatabaseField(columnName = ENTRYID_FIELD_NAME)
    private Integer entryId;
    @DatabaseField
    private String  form;
    @DatabaseField(columnName = LANGMNEMONIC_FIELD_NAME)
    private String  langMnemonic;
    @DatabaseField(columnName = LANGNAME_FIELD_NAME)
    private String  langName;
    @DatabaseField
    private String  gloss;
    @DatabaseField
    private String  cat;
    @DatabaseField
    private String  tengwar;
    @DatabaseField
    private String  mark;
    @DatabaseField(columnName = ELDAMOPAGEID_FIELD_NAME)
    private String  eldamoPageid;
    @DatabaseField
    private String  orderfield;
    @DatabaseField(columnName = PARENTID_FIELD_NAME)
    private Integer parentId;
    @DatabaseField
    private Integer ordering;
    @DatabaseField(columnName = ENTRYTYPEID_FIELD_NAME)
    private Integer entrytypeId;
    @DatabaseField(columnName = ENTRYTYPE_FIELD_NAME)
    private String  entryType;

    protected Lexicon() {}

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer id) {
        this.entryId = id;
    }


    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }


    public String getLangMnemonic() {
        return langMnemonic;
    }

    public void setLangMnemonic(String langMnemonic) {
        this.langMnemonic = langMnemonic;
    }


    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }


    public String getGloss() {
        return gloss;
    }

    public void setGloss(String gloss) {
        this.gloss = gloss;
    }


    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }


    public String getTengwar() {
        return tengwar;
    }

    public void setTengwar(String tengwar) {
        this.tengwar = tengwar;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    public String getEldamoPageid() {
        return eldamoPageid;
    }

    public void setEldamoPageid(String eldamoPageid) {
        this.eldamoPageid = eldamoPageid;
    }


    public String getOrderfield() {
        return orderfield;
    }

    public void setOrderfield(String orderfield) {
        this.orderfield = orderfield;
    }


    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }


    public Integer getEntrytypeId() {
        return entrytypeId;
    }

    public void setEntrytypeId(Integer entrytypeId) {
        this.entrytypeId = entrytypeId;
    }


    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

}
