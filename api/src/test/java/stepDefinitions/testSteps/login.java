package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;


public class login implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public login(Base base) {
        this.base = base;
        Given("^User has a valid userName and password$", (DataTable dataTable) -> {
            base.requestBody = apiMethodHelper.covertDTtoJO(dataTable);
        });
        When("^user sends a get request to the system with the valid credentials$", () -> {
            base.response = apiRequests.login(base.requestBody);
        });
    }
}
