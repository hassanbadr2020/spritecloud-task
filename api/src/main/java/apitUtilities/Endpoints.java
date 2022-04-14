package apitUtilities;

public class Endpoints {
    /**
     * Static variables to contain the end points.
     */
    private static final String USER = "/user";
    private static final String PET = "/pet";
    private static final String STORE_ORDER = "/store/order";
    private static final String LOGIN_USER = "/user/login";
    private static final String FIND_BY_STATUS=PET+"/findByStatus";


    /**
     * All Getters for the above properties.
     */

    public String getUser() {
        return USER;
    }

    public String getLoginUser() {
        return LOGIN_USER;
    }

    public static String getStoreOrder() {
        return STORE_ORDER;
    }

    public static String getPET() {
        return PET;
    }

    public static String getFindByStatus() {
        return FIND_BY_STATUS;
    }
}
