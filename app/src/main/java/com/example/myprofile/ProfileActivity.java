package com.example.myprofile;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myprofile.placeholder.Profile;
import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    ArrayList<Profile> profiles = new ArrayList<>();
    ListView profileListView;

    ProfileAdaptor profileAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileListView = findViewById(R.id.profileListView);

        Profile first = new Profile("lock","Sheee", "5'6", "24 - 06 - 2000", "48kgs", "23", "swimming");

        Profile second = new Profile("lock3","Deee", "5'8", "02 - 03 - 2003", "49kgs", "20", "dancing");

        Profile third = new Profile("screen","Charity", "5'4", "13 - 01 - 1999", "52kgs", "24", "watching");

        Profile fourth = new Profile("screen1","Leone", "6'4", "13 - 12 -1997", "67kgs", "26", "football");

        Profile fifth = new Profile("screen2","Emmanuel", "5'1", "31 - 12 - 1999", "56kgs", "24", "volleyball");

        Profile sixth = new Profile("screen3","Edna", "5'0", "28 - 08 - 2000", "64kgs", "23", "rugby");

        profiles.add(first);
        profiles.add(second);
        profiles.add(third);
        profiles.add(fourth);
        profiles.add(fifth);
        profiles.add(sixth);


        Log.e("arraylist", "size - " + profiles.size());

        profileAdaptor = new ProfileAdaptor(ProfileActivity.this, profiles);
        profileAdaptor.notifyDataSetChanged();
        profileListView.setAdapter(profileAdaptor);
    }
}