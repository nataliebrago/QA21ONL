package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Milestone;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import services.MilestoneService;
import utils.Endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class MilestoneApiTest extends BaseApiTest {
    private final int projectId = 9;

    @Test
    public void getMilestone() {
        RequestSpecification mRequestSpecification = given()
                .pathParam("project_id", projectId)
                .when();

        Response response = mRequestSpecification
                .get(Endpoints.GET_MILESTONES_ENDPOINT)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
    }

    @Test
    public void addMilestone() {
        MilestoneService milestoneService = new MilestoneService();
        Milestone mMilestone = milestoneService.findAllMilestones().get(0);

        RequestSpecification mRequestSpecification = given()
                .body(mMilestone, ObjectMapperType.GSON)
                .pathParam("project_id", projectId)
                .when();

        Response response = mRequestSpecification.post(Endpoints.ADD_MILESTONE_ENDPOINT)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("name", is(mMilestone.getName()))
                .body("description", is(mMilestone.getDescription()))
                .extract()
                .response();
    }


    @Test
    public void updateMilestone() {
        int milestoneId = 9;

        MilestoneService milestoneService = new MilestoneService();
        Milestone mMilestone = milestoneService.findAllMilestones().get(1);

        RequestSpecification mRequestSpecification = given()
                .body(mMilestone, ObjectMapperType.GSON)
                .pathParam("milestone_id", milestoneId)
                .when();

        Response response = mRequestSpecification.post(Endpoints.UPDATE_MILESTONE_ENDPOINT)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("name", is(mMilestone.getName()))
                .body("description", is(mMilestone.getDescription()))
                .extract()
                .response();
    }

    @Test
    public void deleteMilestone() {
        int milestoneId = 8;
        given()
                .pathParam("milestone_id", milestoneId)
                .when()
                .post(Endpoints.DELETE_MILESTONE_ENDPOINT)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}