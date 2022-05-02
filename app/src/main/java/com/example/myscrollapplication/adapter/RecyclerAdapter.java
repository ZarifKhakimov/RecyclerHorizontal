package com.example.myscrollapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myscrollapplication.R;
import com.example.myscrollapplication.activity.ProfileActivity;
import com.example.myscrollapplication.model.Member;
import com.example.myscrollapplication.model.User;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Member> members;

    public RecyclerAdapter(Context context, ArrayList<Member> members){
        this.context = context;
        this.members = members;
    }
    @Override
    public int getItemCount() {
        return members.size();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member_list, parent, false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);

        if(holder instanceof MemberViewHolder){
            ImageView iv_profile = ((MemberViewHolder) holder).iv_profile;
            TextView tv_fullname = ((MemberViewHolder) holder).tv_fullname;

            iv_profile.setImageResource(member.getProfile());
            tv_fullname.setText(member.getFullname());

        }
    }

    public class MemberViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        public View view;
        public ImageView iv_profile;
        public TextView tv_fullname;

        public MemberViewHolder(View v){
            super(v);
            this.view = v;

            iv_profile = view.findViewById(R.id.img_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Toast.makeText(context, "position"+position, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context, ProfileActivity.class);
            context.startActivity(intent);
        }
    }
}

