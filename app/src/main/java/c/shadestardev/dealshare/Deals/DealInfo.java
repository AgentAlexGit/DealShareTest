package c.shadestardev.dealshare.Deals;

/**
 * Created by Alex on 12/26/2017.
 */

public class DealInfo {
    String dealName;
    int dealDistance;
    String dealProvider;

    public DealInfo(String dealName,int dealDistance,String dealProvider)
    {
        this.dealDistance = dealDistance;
        this.dealName = dealName;
        this.dealProvider = dealProvider;
    }
}
