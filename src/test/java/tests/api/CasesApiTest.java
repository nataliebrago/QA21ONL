package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Cases;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.CasesService;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class CasesApiTest extends BaseApiTest {

    @Test
    public void addCase() {
        int sectionId = 8;

        CasesService casesService = new CasesService();
        Cases mCases = casesService.findAllCases().get(0);

        Gson gson = new Gson();

        RequestSpecification mRequestSpecification = given()
                .body(mCases, ObjectMapperType.GSON)
                .pathParam("section_id", sectionId);

        Response response =
                mRequestSpecification.post(Endpoints.ADD_CASE_ENDPOINT)
                        .then()
                        .log()
                        .body()
                        .statusCode(HttpStatus.SC_OK)
                        .extract()
                        .response();


        Cases actualCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(mCases.equals(actualCase));
    }

    @Test
    public void getCase() {
        int caseId = 14;
        Gson gson = new Gson();

        CasesService casesService = new CasesService();
        Cases mCases = casesService.findAllCases().get(0);
        mCases.setId(caseId);

        Response response = given()
                .body(mCases, ObjectMapperType.GSON)
                .pathParam("case_id", caseId)
                .get(Endpoints.GET_CASE_ENDPOINT);

        Cases actualCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(mCases.equals(actualCase));
    }

    @Test
    public void updateCase() {
        int caseId = 14;
        Gson gson = new Gson();

        CasesService casesService = new CasesService();
        Cases mCases = casesService.findAllCases().get(0);

        Response response = given()
                .body(mCases, ObjectMapperType.GSON)
                .pathParam("case_id", caseId)
                .post(Endpoints.UPDATE_CASE_ENDPOINT);
        Cases actualCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(mCases.equals(actualCase));
    }

    @Test
    public void deleteCase() {
        int caseId = 10;
        given()
                .pathParam("case_id", caseId)
                .when()
                .post(Endpoints.DELETE_CASE_ENDPOINT)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}