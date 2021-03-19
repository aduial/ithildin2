package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "entrynoteview")
public class EntryNoteView{

  @DatabaseField(id = true)
  private Long entryId;
  @DatabaseField
  private Long ordering;
  @DatabaseField
  private String txt;

  protected EntryNoteView() {}

  public Long getEntryId() {
    return entryId;
  }

  public void setEntryId(Long entryId) {
    this.entryId = entryId;
  }


  public Long getOrdering() {
    return ordering;
  }

  public void setOrdering(Long ordering) {
    this.ordering = ordering;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

}
