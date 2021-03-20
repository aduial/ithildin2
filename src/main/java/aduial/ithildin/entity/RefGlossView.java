package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "REFGLOSSVIEW")
public class RefGlossView{

  public static final String ENTRYID_FIELD_NAME = "ENTRY_ID";

  @DatabaseField
  private Integer entryId;
  @DatabaseField
  private String refgloss;

  protected RefGlossView() {}

  public Integer getEntryId() {
    return entryId;
  }

  public void setEntryId(Integer entryId) {
    this.entryId = entryId;
  }


  public String getRefgloss() {
    return refgloss;
  }

  public void setRefgloss(String refgloss) {
    this.refgloss = refgloss;
  }

}
