package aduial.ithildin.dao;

import aduial.ithildin.entity.RefInflectView;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class RefInflectDao extends CommonDao {
    public RefInflectDao() {
        super();
    }

    public List<RefInflectView> findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<RefInflectView, Object> refInflectDao = getDao(RefInflectView.class);
        return refInflectDao.queryBuilder()
                            .where()
                            .eq(RefInflectView.ENTRYID_FIELD_NAME, entryId)
                            .query();
    }
}
