package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication.model.EmpData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeRepository {
   /* static final APIInterface myInterface;
    private final MutableLiveData<EmpData> listOfemployes = new MutableLiveData<>();

    private static EmployeeRepository employeeRepository;

    public static EmployeeRepository getInstance(){
        if (employeeRepository == null){
            employeeRepository = new EmployeeRepository();
        }
        return employeeRepository;
    }

    public EmployeeRepository(){
        myInterface = APIClient.getClient();
    }

    public MutableLiveData<EmpData> getListOfMoviesOutputs(String category, int page) {
        Call<EmpData> listOfMovieOut = myInterface.doGetEmpData();
        listOfMovieOut.enqueue(new Callback<EmpData>() {
            @Override
            public void onResponse(@NonNull Call<EmpData> call, @NonNull Response<EmpData> response) {
                listOfemployes.setValue(response.body());
            }
            @Override
            public void onFailure(@NonNull Call<EmpData> call, @NonNull Throwable t) {
                listOfemployes.postValue(null);
            }
        });
        return listOfemployes;
    }
}
*/
}
