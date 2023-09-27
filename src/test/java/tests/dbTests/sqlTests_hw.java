package tests.dbTests;

import baseEntities.BaseDBTest;
import dbEntities.CasesTable;
import dbEntities.MilestonesTable;
import models.Cases;
import models.Milestone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import services.CasesService;
import services.MilestoneService;


public class sqlTests_hw extends BaseDBTest {
    private final static int projectId = 9;
    static Logger logger = LogManager.getLogger(sqlTests_hw.class);

    @Test
    public void createMilestonesTableTest() {
        MilestonesTable milestonesTable = new MilestonesTable(dataBaseService);
        milestonesTable.dropTable();
        milestonesTable.createTable();

        MilestoneService milestoneService = new MilestoneService();
        Milestone milestone = new Milestone("Milestone_for_project_id = " + projectId, "Description for Milestone_for_project_id = " + projectId);
        milestoneService.saveMilestone(milestone);
        Milestone milestone2 = new Milestone("Milestone_2_for_project_id = " + projectId, "Description for Milestone_2_for_project_id = " + projectId);
        milestoneService.saveMilestone(milestone2);
    }

    @Test
    public void createCasesTableTest() {

        CasesTable casesTable = new CasesTable(dataBaseService);
        casesTable.dropTable();
        casesTable.createTable();

        CasesService casesService = new CasesService();
        Cases mCase = Cases.builder()
                .title("section 2 test 2")
                .templateId(3)
                .typeId(4)
                .priorityId(2)
                .sectionId(5)
                .build();
        casesService.saveCase(mCase);
    }
}