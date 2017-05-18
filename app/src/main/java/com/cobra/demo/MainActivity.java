package com.cobra.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.cobra.pickerdialog.R;
import com.sys.datepicker.DatePicker;
import com.sys.datepicker.DatePickerDialog;


public class MainActivity extends AppCompatActivity {


    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        findViewById(R.id.btn_date_choice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });
    }
    private void showDateDialog(){
        DatePickerDialog dialog=new DatePickerDialog(mContext, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Toast.makeText(mContext,year+"年"+month+"月"+day+"日",Toast.LENGTH_SHORT).show();
            }
        }, 2017, 5, 17);
        dialog.getDatePicker().setCalendarViewShown(false);
        dialog.show();
    }
}
