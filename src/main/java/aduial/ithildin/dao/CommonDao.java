package aduial.ithildin.dao;

import aduial.ithildin.dbutils.DBManager;
import aduial.ithildin.entity.Root;
import aduial.ithildin.util.FxmlUtils;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public abstract class CommonDao {

    public static final Logger           LOGGER = LoggerFactory.getLogger(CommonDao.class);
    protected final     ConnectionSource connectionSource;

    protected CommonDao() {
        this.connectionSource = DBManager.getConnectionSource();
    }

    public <T extends Root, I> Dao<T, I> getDao(Class<T> cls) throws SauronException {
        try {
            return DaoManager.createDao(connectionSource, cls);
        } catch (SQLException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.get.dao"));
        } finally {
            this.closeDbConnection();
        }
    }

    public <T extends Root, I> void createOrUpdate(Root root) throws SauronException {
        Dao<T, I> dao = getDao((Class<T>) root.getClass());
        try {
            dao.createOrUpdate((T) root);
        } catch (SQLException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.create.update"));
        } finally {
            this.closeDbConnection();
        }
    }

    public <T extends Root, I> void refresh(Root root) throws SauronException {
        Dao<T, I> dao = getDao((Class<T>) root.getClass());
        try {
            dao.refresh((T) root);
        } catch (SQLException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.refresh"));
        } finally {
            this.closeDbConnection();
        }
    }

    public <T extends Root, I> void delete(Root root) throws SauronException {
        Dao<T, I> dao = getDao((Class<T>) root.getClass());
        try {
            dao.delete((T) root);
        } catch (SQLException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.delete"));
        } finally {
            this.closeDbConnection();
        }
    }

    public <T extends Root, I> void deleteById(Class<T> cls, Integer id) throws SauronException {
        try {
            Dao<T, I> dao = getDao(cls);
            dao.deleteById((I) id);
        } catch (SQLException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.delete"));
        } finally {
            this.closeDbConnection();
        }
    }

    public <T extends Root, I> T findById(Class<T> cls, Integer id) throws SauronException {
        try {
            Dao<T, I> dao = getDao(cls);
            return dao.queryForId((I) id);
        } catch (SQLException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.not.found"));
        } finally {
            this.closeDbConnection();
        }
    }

    public <T extends Root, I> List<T> queryForAll(Class<T> cls) throws SauronException {
        Dao<T, I> dao = getDao(cls);
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.not.found.all"));
        } finally {
            this.closeDbConnection();
        }
    }

    private void closeDbConnection() throws SauronException {
        try {
            this.connectionSource.close();
        } catch (IOException e) {
            LOGGER.warn(e.getCause().getMessage());
            throw new SauronException(FxmlUtils.getResourceBundle().getString("error.get.dao"));
        }
    }
}