package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.java8.En;
import org.json.simple.JSONObject;

public class listPets implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public listPets(Base base) {
        this.base = base;
        Given("^User wants to find pet within \"([^\"]*)\"$", (String status) -> {
            base.queryParam = new JSONObject();
            base.queryParam.put("status", status);
        });
        When("^Sends get request to pet endpoint with the status as query parameter$", () -> {
            base.response = apiRequests.findPetByStatus(base.queryParam);
        });
    }
}
