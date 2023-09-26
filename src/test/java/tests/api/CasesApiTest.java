package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Case;
import models.Milestone;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class CasesApiTest extends BaseApiTest {

    @Test
    public void addCase(){
        int sectionId = 8;

        Gson gson = new Gson();
        Case mCase = Case.builder()
                .title("test_section_2_case_2")
                .templateId(3)
                .typeId(2)
                .priorityId(2)
                .sectionId(5)
                .build();


        RequestSpecification mRequestSpecification  =  given()
                .body(mCase, ObjectMapperType.GSON)
                .pathParam("section_id",sectionId);

        Response response =
                mRequestSpecification.post(Endpoints.ADD_CASE_ENDPOINT)
                .then()
                .log()
                .body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();


        Case actualCase = gson.fromJson(response.getBody().asString(), Case.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(mCase.equals(actualCase));
    }

    @Test
    public void getCase(){
        int caseId = 14;
        Gson gson = new Gson();

        Case mCase = Case.builder()
                .title("section 2 test 2")
                .templateId(3)
                .typeId(4)
                .priorityId(2)
                .sectionId(5)
                .build();

        Response response = given()
                .body(mCase, ObjectMapperType.GSON)
                .pathParam("case_id",caseId)
                .get(Endpoints.GET_CASE_ENDPOINT);

        Case actualCase = gson.fromJson(response.getBody().asString(), Case.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(mCase.equals(actualCase));
    }

    @Test
    public void updateCase(){
        int caseId = 14;
        Gson gson = new Gson();

        Case mCase = Case.builder()
                .title("update section 2 test 2")
                .templateId(3)
                .typeId(4)
                .priorityId(2)
                .sectionId(5)
                .build();

        Response response = given()
                .body(mCase, ObjectMapperType.GSON)
                .pathParam("case_id",caseId)
                .post(Endpoints.UPDATE_CASE_ENDPOINT);
        Case actualCase = gson.fromJson(response.getBody().asString(), Case.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(mCase.equals(actualCase));
    }

    @Test
    public void deleteCase(){
        int caseId = 10;
        given()
                .pathParam("case_id",caseId)
                .when()
                .post(Endpoints.DELETE_CASE_ENDPOINT)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}