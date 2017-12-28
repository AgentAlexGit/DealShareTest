package c.shadestardev.dealshare.Deals;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import c.shadestardev.dealshare.R;

/**
 * Created by Alex on 12/26/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<DealInfo> mItemList;

    public RecyclerAdapter(List<DealInfo> itemList)
    {
        mItemList = itemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return RecyclerItemViewHolder.newInstance(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        RecyclerItemViewHolder holder = (RecyclerItemViewHolder) viewHolder;
        DealInfo dealInfo = mItemList.get(position);
        holder.setItemText(dealInfo);

    }

    @Override
    public int getItemCount() {
        return mItemList == null ? 0 : mItemList.size();
    }
}
