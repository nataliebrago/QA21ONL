package dbEntities;

import com.google.gson.annotations.SerializedName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.DataBaseService;

import javax.persistence.Column;
import java.sql.ResultSet;

public class CasesTable {
    static Logger logger = LogManager.getLogger(CasesTable.class);

    DataBaseService dataBaseService;

    public CasesTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public void dropTable() {
        logger.info("Удаляем cases таблицу");
        String dropTableCasesSQL = "DROP TABLE Cases;";

        dataBaseService.executeSQL(dropTableCasesSQL);
    }

    public void createTable() {
        logger.info("Создаем cases таблицу");

        String createTableSQL = "CREATE TABLE Cases (" +
                "ID SERIAL PRIMARY KEY, " +
                "Title CHARACTER VARYING(30), " +
                "Template_Id CHARACTER VARYING(30), " +
                "Type_Id CHARACTER VARYING(30), " +
                "Priority_Id CHARACTER VARYING(30), " +
                "Section_Id CHARACTER VARYING(30) " +
                ");";

        dataBaseService.executeSQL(createTableSQL);
    }
}