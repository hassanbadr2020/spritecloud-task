package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.junit.Assert;


public class placeOrder implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public placeOrder(Base base) {
        this.base = base;
        Given("^user has valid data to store a pet$", (DataTable dataTable) -> {
            base.requestBody = apiMethodHelper.covertDTtoJO(dataTable);
        });
        When("^send a post request with the valid body$", () -> {
            base.response = apiRequests.placeOrder(base.requestBody);
        });
        Then("^the order has been stored successfully with status \"([^\"]*)\"$", (String expected) -> {
            Assert.assertEquals(expected, base.response.jsonPath().get("status"));
        });
    }
}
