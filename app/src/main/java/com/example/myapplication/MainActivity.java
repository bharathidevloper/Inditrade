package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.model.Datum;
import com.example.myapplication.model.EmpData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView emplyee_data_rv;
TextView no_date_tv;
EmpAdapter adapter;
APIInterface myInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no_date_tv=findViewById(R.id.no_date_tv);
        emplyee_data_rv=findViewById(R.id.emplyee_data_rv);
        myInterface=   APIClient.getClient().create(APIInterface.class);
        getData();
    }

    private void getData(){
        Call<EmpData> listOfMovieOut = myInterface.doGetEmpData();
        listOfMovieOut.enqueue(new Callback<EmpData>() {
            @Override
            public void onResponse(@NonNull Call<EmpData> call, @NonNull Response<EmpData> response) {
                Log.d("MainActivity", "" + response.body());
                Log.d("MainActivity", "" + response.code());
                Log.d("MainActivity", "" + response.message());
                if (response.code() == 200) {
                    EmpData empData = response.body();
                    if (empData.getMsgStatus().equalsIgnoreCase("200")) {
                        List<Datum> datumList = empData.getData();
                        if (datumList != null && datumList.size() > 0) {
                            emplyee_data_rv.setVisibility(View.VISIBLE);
                            no_date_tv.setVisibility(View.GONE);
                            emplyee_data_rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                            adapter = new EmpAdapter(MainActivity.this, datumList);
                            emplyee_data_rv.setAdapter(adapter);
                        } else {
                            Log.d("MainActivity", "No Data");
                            emplyee_data_rv.setVisibility(View.VISIBLE);
                            no_date_tv.setVisibility(View.GONE);
                        }
                    }
                    else {
                        Log.d("MainActivity", "No Data2");
                        emplyee_data_rv.setVisibility(View.VISIBLE);
                        no_date_tv.setVisibility(View.GONE);

                    }

                }
                else {

                }
            }
            @Override
            public void onFailure(@NonNull Call<EmpData> call, @NonNull Throwable t) {
                Log.d("MainActivity",""+t.toString());

            }
        });
    }

}