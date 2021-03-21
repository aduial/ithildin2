package aduial.ithildin.dao;

import aduial.ithildin.entity.RefGlossView;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class RefGlossDao extends CommonDao {
    public RefGlossDao() {
        super();
    }

    public List<RefGlossView> findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<RefGlossView, Object> refGlosstDao = getDao(RefGlossView.class);
        return refGlosstDao.queryBuilder()
                             .where()
                             .eq(RefGlossView.ENTRYID_FIELD_NAME, entryId)
                             .query();
    }
}
