package apiRequests;

import apitUtilities.ApiRequestBuilder;
import apitUtilities.Endpoints;
import environments.handler.DataManager;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class ApiRequests {


    DataManager dataManager = new DataManager();
    ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
    Endpoints endpoints = new Endpoints();


    public Response createUser(JSONObject body) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getUser(), "POST", body, null, null, null);
    }

    public Response placeOrder(JSONObject body) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getStoreOrder(), "POST", body, null, null, null);
    }

    public Response deleteOrder(Long id) {

        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getStoreOrder() + "/" + id, "DELETE", null, null, null, null);
    }

    public Response login(JSONObject queryParameter) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getLoginUser(), "GET", null, "Query", queryParameter, null);
    }

    public Response findPetByStatus(JSONObject queryParameter) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getFindByStatus(), "GET", null, "Query", queryParameter, null);
    }

    public Response addPet(JSONObject body) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getPET(), "POST", body, null, null, null);
    }

    public Response deletePet(Long id) {

        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getPET() + "/" + id, "DELETE", null, null, null, null);
    }

}
