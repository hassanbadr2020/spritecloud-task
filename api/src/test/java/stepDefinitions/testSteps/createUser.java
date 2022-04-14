package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.junit.Assert;

public class createUser implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public createUser(Base base) {
        this.base = base;
        Given("^Admin has valid data to create a new user$", (DataTable dataTable) -> {
            base.requestBody = apiMethodHelper.covertDTtoJO(dataTable);
        });
        When("^Admin send post request to create user$", () -> {
            base.response = apiRequests.createUser(base.requestBody);
        });
        And("^status code is \"([^\"]*)\"$", (String statusCode) -> {
            Assert.assertEquals(Integer.parseInt(statusCode), base.response.statusCode());
        });
        Then("^response body matches \"([^\"]*)\" in Api contract$", (String schemaName) ->
        {
            apiMethodHelper.validateSchema(schemaName, base.response);
        });
    }
}
