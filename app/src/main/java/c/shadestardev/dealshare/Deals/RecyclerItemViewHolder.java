package c.shadestardev.dealshare.Deals;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import c.shadestardev.dealshare.R;

/**
 * Created by Alex on 12/26/2017.
 */

public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {

    private final TextView mDealName;
    private final TextView mDealDistance;
    private final TextView mDealLocation;

    public RecyclerItemViewHolder(View itemView, TextView dealName,TextView dealDistance,TextView dealLocation) {
        super(itemView);
        mDealName = dealName;
        mDealDistance = dealDistance;
        mDealLocation = dealLocation;

    }

    public static RecyclerItemViewHolder newInstance(View parent)
    {
        TextView dealName= (TextView)parent.findViewById(R.id.dealname);
        TextView dealDistance = (TextView)parent.findViewById(R.id.dealdistance);
        TextView deallocation = (TextView)parent.findViewById(R.id.deallocation);

        return new RecyclerItemViewHolder(parent,dealName,dealDistance,deallocation);
    }

    public void setItemText(DealInfo info)
    {
        mDealName.setText(info.dealName);
        mDealDistance.setText(info.dealDistance + " miles");
        mDealLocation.setText(info.dealProvider);
    }
}
