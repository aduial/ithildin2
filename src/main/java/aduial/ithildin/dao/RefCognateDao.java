package aduial.ithildin.dao;

import aduial.ithildin.entity.RefCognateView;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class RefCognateDao extends CommonDao {
    public RefCognateDao() {
        super();
    }

    public List<RefCognateView> findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<RefCognateView, Object> refCognatetDao = getDao(RefCognateView.class);
        return refCognatetDao.queryBuilder()
                             .where()
                             .eq(RefCognateView.ENTRYID_FIELD_NAME, entryId)
                             .query();
    }
}
