package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "SIMPLEXICON")
public class SimpLexicon implements Root {


    public static final String GLOSS_FIELD_NAME = "GLOSS";
    public static final String FORM_FIELD_NAME = "FORM";
    public static final String LANGID_FIELD_NAME = "LANGUAGE_ID";

    @DatabaseField
    private Integer entryId;
    @DatabaseField
    private String  mark;
    @DatabaseField
    private String  form;
    @DatabaseField
    private Integer languageId;
    @DatabaseField
    private String  languagename;
    @DatabaseField
    private String  gloss;
    @DatabaseField
    private String  cat;
    @DatabaseField
    private String  stem;
    @DatabaseField
    private Integer entrytypeId;

    protected SimpLexicon() {}

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer id) {
        this.entryId = id;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }


    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }


    public String getLanguagename() {
        return languagename;
    }

    public void setLanguagename(String languagename) {
        this.languagename = languagename;
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


    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }


    public Integer getEntrytypeId() {
        return entrytypeId;
    }

    public void setEntrytypeId(Integer entrytypeId) {
        this.entrytypeId = entrytypeId;
    }

}
