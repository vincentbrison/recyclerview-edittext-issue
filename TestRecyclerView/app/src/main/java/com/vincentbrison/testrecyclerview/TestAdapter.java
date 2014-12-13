package com.vincentbrison.testrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;


public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<DummyEntry> mDataset;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public EditText mEditText;

        public ViewHolder(View v) {
            super(v);
            mEditText = (EditText) v.findViewById(R.id.list_item_edittext);
        }
    }

    public TestAdapter(List<DummyEntry> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public TestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {

        Log.v("test-recyclerview", "onCreateViewHolder");

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mEditText.setText(mDataset.get(position).getTextToDisplay());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
