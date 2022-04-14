package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.util.ArrayList;

public class addPet implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public addPet(Base base) {
        this.base = base;
        Given("^user has status and name$", (DataTable dataTable) -> {
            base.requestBody = apiMethodHelper.covertDTtoJO(dataTable);

        });
        And("^the photo urls of \"([^\"]*)\" pet$", (String url) -> {

            ArrayList<String> urls = new ArrayList<String>();
            urls.add(url);
            base.requestBody.put("photoUrls", urls);
        });
        When("^user send post request with these valid data$", () -> {
            System.out.println(base.requestBody);
            base.response = apiRequests.addPet(base.requestBody);
        });
        Then("^the pet added with name \"([^\"]*)\"$", (String PetName) -> {
            Assert.assertEquals(PetName, base.response.jsonPath().get("name"));

        });
    }
}
