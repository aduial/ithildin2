package aduial.ithildin.dao;

import aduial.ithildin.entity.Ref;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class RefDao extends CommonDao {
    public RefDao() {
        super();
    }

    public List<Ref> findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<Ref, Integer> refDao = getDao(Ref.class);
        return refDao.queryBuilder()
                           .where()
                           .eq(Ref.ENTRYID_FIELD_NAME, entryId)
                           .query();
    }
}
