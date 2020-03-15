package com.example.homeactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.homeactivity.Adapter.RecyclerViewAdapterStories;
import com.example.homeactivity.Adapter.RecyclerviewAdapterFeed;
import com.example.homeactivity.Models.HomeModel;
import com.example.homeactivity.Models.StoriesModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView1;
RecyclerView recyclerView2;

ArrayList<StoriesModel>storiesModelArrayList=new ArrayList<>();
ArrayList<HomeModel>HomeModelArrayList=new ArrayList<>();

RecyclerviewAdapterFeed adapterFeed;
RecyclerViewAdapterStories adapterStories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
recyclerView1=(RecyclerView)findViewById(R.id.recy_feed);
recyclerView2=(RecyclerView)findViewById(R.id.recy_stories);

RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
recyclerView1.setLayoutManager((layoutManager));

RecyclerView.LayoutManager layoutManager1=new LinearLayoutManager(this);
        ((LinearLayoutManager)layoutManager1).setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(layoutManager1);
      adapterFeed=new RecyclerviewAdapterFeed(this,HomeModelArrayList);
      adapterStories=new RecyclerViewAdapterStories(this,storiesModelArrayList);



      recyclerView1.setAdapter(adapterFeed);
      recyclerView2.setAdapter(adapterStories);

      populaterecyclerview();
      populaterecyclerviewstories();

    }
private void populaterecyclerviewstories(){
        StoriesModel

                storiesModel=new StoriesModel("Mboya.Danroylex",R.drawable.user1);
        storiesModelArrayList.add(storiesModel);
    storiesModel=new StoriesModel("M.Danr",R.drawable.user1);
    storiesModelArrayList.add(storiesModel);
    storiesModel=new StoriesModel("John.Dan",R.drawable.user1);
    storiesModelArrayList.add(storiesModel);
    storiesModel=new StoriesModel("Mboya.roylex",R.drawable.user1);
    storiesModelArrayList.add(storiesModel);
    storiesModel=new StoriesModel("Mboya.Dan",R.drawable.user1);
    storiesModelArrayList.add(storiesModel);
    storiesModel=new StoriesModel("Moa.Dan",R.drawable.user1);
    storiesModelArrayList.add(storiesModel);

}
private void populaterecyclerview(){
        HomeModel
                homeModel=new HomeModel("Mboya.Danroylex","2 Hours Ago","Richard","#mboya#kalama#peace#elizaphan#Karisa",
                86,R.drawable.user1,R.drawable.post1,R.drawable.user1,R.drawable.user2);
        HomeModelArrayList.add(homeModel);

                homeModel=new HomeModel("Mboya.Danroylex","20 Minutes Ago","John","#mboya#Debby#Sammy#Terry#Karisa",
                92,R.drawable.user2,R.drawable.post2,R.drawable.user2,R.drawable.user3);
    HomeModelArrayList.add(homeModel);

    homeModel=new HomeModel("Mboya.Danroylex","5 Hours Ago","Ken","#mboya#kalama#peace#Kamau#Brenda",
            100,R.drawable.user3,R.drawable.post5,R.drawable.user3,R.drawable.user3);
    HomeModelArrayList.add(homeModel);

    homeModel=new HomeModel("Mboya.Danroylex","30 minutes Ago","Reggy","#mboya#kalama#peace#Soul#Jakky",
            80,R.drawable.user4,R.drawable.post6,R.drawable.user4,R.drawable.user4);
    HomeModelArrayList.add(homeModel);

    homeModel=new HomeModel("Mboya.Danroylex","36 minutes  Ago","Linda","#Tom#kalama#Gaither#Born#Robbin",
            70,R.drawable.user5,R.drawable.post5,R.drawable.user5,R.drawable.user5);
    HomeModelArrayList.add(homeModel);

    homeModel=new HomeModel("Mboya.Danroylex","7 Hours Ago","Johnson","#Leah#kalama#peace#elizaphan#Eli",
            60,R.drawable.user6,R.drawable.post5,R.drawable.user6,R.drawable.user6);
    HomeModelArrayList.add(homeModel);

}
}