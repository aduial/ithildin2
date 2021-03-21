package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "REFINFLECTVIEW")
public class RefInflectView implements Root {

  public static final String ENTRYID_FIELD_NAME = "ENTRY_ID";

  @DatabaseField(columnName = ENTRYID_FIELD_NAME)
  private Integer entryId;
  @DatabaseField
  private String form;
  @DatabaseField
  private String grammar;
  @DatabaseField
  private String gloss;
  @DatabaseField
  private String sources;

  protected RefInflectView() {}

  public Integer getEntryId() {
    return entryId;
  }

  public void setEntryId(Integer entryId) {
    this.entryId = entryId;
  }


  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }


  public String getGrammar() {
    return grammar;
  }

  public void setGrammar(String grammar) {
    this.grammar = grammar;
  }


  public String getGloss() {
    return gloss;
  }

  public void setGloss(String gloss) {
    this.gloss = gloss;
  }


  public String getSources() {
    return sources;
  }

  public void setSources(String sources) {
    this.sources = sources;
  }

}
