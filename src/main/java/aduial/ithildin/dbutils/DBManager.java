package aduial.ithildin.dbutils;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class DBManager {


    public static final  Logger LOGGER      = LoggerFactory.getLogger(DBManager.class);
    public static final  String USER        = "sa";
    public static final  String PASS        = "mellon";
    private static final String H2DIRECTORY = "h2db";
    private static final String H2NAME      = "h2eldamo";
    private static ConnectionSource connectionSource;

    private static void createConnectionSource() {
        try {
            File h2Directory = new File(System.getProperty("user.home") + File.separator + H2DIRECTORY);
            if (h2Directory.exists()) {
                connectionSource = new JdbcConnectionSource(getDBLocation("~"), USER, PASS);
                LOGGER.info("Connected to DB @ " + System.getProperty("user.home") + File.separator + H2DIRECTORY);
            } else {
                connectionSource = new JdbcConnectionSource(getDBLocation("."), USER, PASS);
                LOGGER.info("Connected to DB at project directory /" + H2DIRECTORY);
            }
        } catch (SQLException e) {
            LOGGER.warn("Could not find database: " + e.getMessage());
        }
    }

    private static String getDBLocation(String base) {
        return "jdbc:h2:file:" + base + "/" + H2DIRECTORY + "/" + H2NAME;
    }

    public static ConnectionSource getConnectionSource() {
        if (connectionSource == null) {
            createConnectionSource();
        }
        return connectionSource;
    }

    public static void closeConnectionSource() {
        if (connectionSource != null) {
            try {
                connectionSource.close();
            } catch (IOException e) {
                LOGGER.warn(e.getMessage());
            }
        }
    }
}
