package aduial.ithildin.entity;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "refinflectview")
public class RefInflectView{

  @Id
  private Long entryId;
  private String form;
  private String grammar;
  private String gloss;
  private String sources;

  protected RefInflectView() {}

  public Long getEntryId() {
    return entryId;
  }

  public void setEntryId(Long entryId) {
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
