package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.java8.En;

public class deleteOrder implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public deleteOrder(Base base) {
        this.base = base;
        When("^user sends a delete request to the system with the valid OrderId witch has been created$", () -> {
            base.response = apiRequests.deleteOrder(base.response.jsonPath().getLong("id"));
        });
    }
}
