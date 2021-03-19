package aduial.ithildin.entity;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "speechformview")
public class SpeechFormView{

  @Id
  private Long entryId;
  private String txt;

  protected SpeechFormView() {}

  public Long getEntryId() {
    return entryId;
  }

  public void setEntryId(Long entryId) {
    this.entryId = entryId;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

}
