package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Presidents App";
    Button btnAdd;
    RecyclerView recylerView;
    List<President> presidentList = new ArrayList<President>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd =findViewById(R.id.btnAdd);

        fillPresidentList();
        Log.d(TAG,"onCreate: "+presidentList.toString());
        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityAdd.class);
                startActivity(intent);
            }
        });
        recylerView =findViewById(R.id.lvPreview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recylerView.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(presidentList,MainActivity.this);
        recylerView.setAdapter(adapter);


    }

    private void fillPresidentList() {
        President p0=new President(0,1789,"George Washington","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg/330px-Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");
        President p1=new President(1,1797,"John Adams","https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/John_Adams_A18236.jpg/225px-John_Adams_A18236.jpg");
        President p2=new President(2,1801,"Thomas Jefferson","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Thomas_Jefferson_by_Rembrandt_Peale%2C_1800.jpg/225px-Thomas_Jefferson_by_Rembrandt_Peale%2C_1800.jpg");
        President p3=new President(3,1809,"James Madison","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/James_Madison.jpg/225px-James_Madison.jpg");
        President p4=new President(4,1817,"James Monroe","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/James_Monroe_White_House_portrait_1819.jpg/225px-James_Monroe_White_House_portrait_1819.jpg");
        President p5=new President(5,1825,"John Quincy Adams","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/John_Quincy_Adams_by_Charles_Osgood.jpg/225px-John_Quincy_Adams_by_Charles_Osgood.jpg");
        President p6=new President(6, 1829,"Andrew Jackson","https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Andrew_jackson_head.jpg/225px-Andrew_jackson_head.jpg");
        President p7=new President(7,1837,"Martin Van Buren","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Martin_Van_Buren_circa_1837_crop.jpg/225px-Martin_Van_Buren_circa_1837_crop.jpg");
        President p8=new President(8,1841,"William Henry Harrison","https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg/225px-William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg");
        President p9=new President(9,1841,"John Tyler","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/John_Tyler_crop.jpg/225px-John_Tyler_crop.jpg");
        presidentList.addAll(Arrays.asList(new President[]{p0,p1,p2,p3,p4,p5,p6,p7,p8,p9}));
    }
}