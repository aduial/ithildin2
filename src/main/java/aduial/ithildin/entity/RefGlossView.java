package aduial.ithildin.entity;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "refglossview")
public class RefGlossView{

  @Id
  private Long entryId;
  private String refgloss;

  protected RefGlossView() {}

  public Long getEntryId() {
    return entryId;
  }

  public void setEntryId(Long entryId) {
    this.entryId = entryId;
  }


  public String getRefgloss() {
    return refgloss;
  }

  public void setRefgloss(String refgloss) {
    this.refgloss = refgloss;
  }

}
