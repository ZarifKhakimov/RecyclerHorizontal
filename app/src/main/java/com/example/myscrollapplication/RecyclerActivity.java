package com.example.myscrollapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.drawable.iphone, "Xurshidbek"));
        members.add(new Member(R.drawable.kosmos, "Begzodbek"));
        members.add(new Member(R.drawable.iphone, "Xurshidbek"));
        members.add(new Member(R.drawable.kosmos, "Xurshidbek"));

        refreshAdapter(members);
    }

    void refreshAdapter(ArrayList<Member> members){
        RecyclerAdapter adapter = new RecyclerAdapter(context, members);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }
}
