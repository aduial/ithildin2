package aduial.ithildin.entity;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "ENTRYNOTEVIEW")
public class EntryNoteView implements Root{

  public static final String ENTRYID_FIELD_NAME = "ENTRY_ID";

  @DatabaseField(columnName = ENTRYID_FIELD_NAME)
  private Integer entryId;
  @DatabaseField
  private Integer ordering;
  @DatabaseField(dataType = DataType.LONG_STRING)
  private String txt;

  protected EntryNoteView() {}

  public Integer getEntryId() {
    return entryId;
  }

  public void setEntryId(Integer entryId) {
    this.entryId = entryId;
  }


  public Integer getOrdering() {
    return ordering;
  }

  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

}
