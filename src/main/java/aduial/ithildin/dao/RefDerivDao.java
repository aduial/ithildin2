package aduial.ithildin.dao;

import aduial.ithildin.entity.RefDerivView;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class RefDerivDao extends CommonDao {
    public RefDerivDao() {
        super();
    }

    public List<RefDerivView> findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<RefDerivView, Object> refDerivtDao = getDao(RefDerivView.class);
        return refDerivtDao.queryBuilder()
                             .where()
                             .eq(RefDerivView.ENTRYID_FIELD_NAME, entryId)
                             .query();
    }
}
