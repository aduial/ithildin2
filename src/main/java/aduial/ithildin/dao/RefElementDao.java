package aduial.ithildin.dao;

import aduial.ithildin.entity.RefElementView;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class RefElementDao extends CommonDao {
    public RefElementDao() {
        super();
    }

    public List<RefElementView> findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<RefElementView, Object> refElementtDao = getDao(RefElementView.class);
        return refElementtDao.queryBuilder()
                            .where()
                            .eq(RefElementView.ENTRYID_FIELD_NAME, entryId)
                            .query();
    }
}
