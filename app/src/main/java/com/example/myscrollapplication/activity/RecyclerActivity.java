package com.example.myscrollapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myscrollapplication.R;
import com.example.myscrollapplication.adapter.RecyclerAdapter;
import com.example.myscrollapplication.model.Member;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initViews();

    }
    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.drawable.alisher_davlatov, "Akmal Davlatov"));
        members.add(new Member(R.drawable.xurshidbek_qurbonov, "Xurshidbek Qurbobov"));
        members.add(new Member(R.drawable.mehrob_aka, "Mehrob Fayziyev"));
        members.add(new Member(R.drawable.me, "Asilbek Jahonov"));
        members.add(new Member(R.drawable.sanjarbek_suvonov_s, "Sanjarbek Suvonov"));
        members.add(new Member(R.drawable.akmal_paiziyev, "Akmal Paiziyev"));
        members.add(new Member(R.drawable.davronbek_turdiyev, "Davronbek Turdiyev"));
        members.add(new Member(R.drawable.dilshod_mirsoatov, "Dilshod Mirsoatov"));
        members.add(new Member(R.drawable.kadirov_dev, "Akmal Qodirov"));
        members.add(new Member(R.drawable.nurbek_boboyev_n, "Nurbek Boboyev"));
        members.add(new Member(R.drawable.umidjon_ishmuhammedov, "Umidjon Ishmuhamedov"));
        members.add(new Member(R.drawable.odilbek_mirzayev, "Odilbek Mirzayev"));


        refreshAdapter(members);
        fun();
    }

    void refreshAdapter(ArrayList<Member> members){
        RecyclerAdapter adapter = new RecyclerAdapter(context, members);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }
    void fun(){
       Member member = new Member(2, "Senior");
       sad(member);
    }
    void sad(Member member){
        Intent i = new Intent(this, ProfileActivity.class);
        i.putExtra("member", member);
        startActivity(i);
    }

}
