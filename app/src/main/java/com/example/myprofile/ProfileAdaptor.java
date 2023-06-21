package com.example.myprofile;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myprofile.placeholder.Profile;

import java.util.ArrayList;

public class ProfileAdaptor extends BaseAdapter {
    ArrayList<Profile> profileArrayList = new ArrayList<>();
    Context context;
    LayoutInflater inflater = null;
    private ImageView imageView;

    public ProfileAdaptor(Context myContext, ArrayList<Profile> profileArrayList) {
        Log.e("adaptor", "1");
        this.profileArrayList = profileArrayList;
        this.context = myContext;
        this.inflater = LayoutInflater.from(context);

    }

    public static class Holder {
        ImageView imageView;
        TextView textname;
        TextView textheight;
        TextView textdob;
        TextView textweight;
        TextView textage;
        TextView texthobby;

    }

    @Override
    public int getCount() {
        int size = profileArrayList.size();
        return size;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View view, final ViewGroup parent) {

        try {
            final Holder holder;
            if (view == null) {
                view = inflater.inflate(R.layout.layout_profile_row, parent,
                        false);

                holder = new Holder();

                Log.e("holder at", "index - " + position );

                holder.imageView = view.findViewById(R.id.imageView);
                holder.textname = view.findViewById(R.id.textname);
                holder.textheight = view.findViewById(R.id.textheight);
                holder.textdob = view.findViewById(R.id.textdob);
                holder.textweight = view.findViewById(R.id.textweight);
                holder.textage = view.findViewById(R.id.textage);
                holder.texthobby = view.findViewById(R.id.texthobby);


                view.setTag(holder);
            } else {
                holder = (Holder) view.getTag();
            }
            int resourceId = context.getResources().getIdentifier(profileArrayList.get(position).getImage(), "drawable", context.getPackageName());
            holder.imageView.setImageResource(resourceId);
            holder.textname.setText(profileArrayList.get(position).getName());
            holder.textheight.setText(profileArrayList.get(position).getHeight());
            holder.textdob.setText(profileArrayList.get(position).getdob());
            holder.textweight.setText(profileArrayList.get(position).getWeight());
            holder.textage.setText(profileArrayList.get(position).getAge());
            holder.texthobby.setText(profileArrayList.get(position).getHobby());


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            return view;
        }catch ( Exception e) {
            Log.e("adaptor ", "exception - " + e);
            return  null;
        }

    }
}