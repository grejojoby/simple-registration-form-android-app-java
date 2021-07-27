package com.grejojoby.experiment10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nameEditText = (EditText) findViewById(R.id.names);
        String fullName = nameEditText.getText().toString();

        EditText phoneEditText = (EditText) findViewById(R.id.names);
        String phone = phoneEditText.getText().toString();

        EditText addressEditText = (EditText) findViewById(R.id.names);
        String address = addressEditText.getText().toString();

        //initiate a check box
        CheckBox conditionsCheckBox = (CheckBox) findViewById(R.id.conditions);

        //check current state of the check box
        Boolean checkBoxState = conditionsCheckBox.isChecked();

    }

    public void radioButtonhandler(View view) {

        // Decide what happens when a user clicks on a button
    }

    public void submitbuttonHandler(View view) {
        //Decide what happens when the user clicks the submit button
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);
        //Creating dialog box
        AlertDialog alert = builder.create();
        alert.show();
    }
}