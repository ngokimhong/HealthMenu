package com.example.taminhhieu.healthmenu;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Button mShowLoginDialog = findViewById(R.id.btnShowDialog);
        mShowLoginDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(LoadingActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_login, null);
                final EditText mId = mView.findViewById(R.id.txtID);
                final EditText mPassword = mView.findViewById(R.id.txtPassword);
                final Button mLogin = mView.findViewById(R.id.btnLoginD);
                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!mId.getText().toString().isEmpty())
                            if (!mPassword.getText().toString().isEmpty()) {
                                Toast.makeText(LoadingActivity.this,
                                        R.string.success_login_msg,
                                        Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(LoadingActivity.this, HomeActivity.class));

                            } else {
                                Toast.makeText(LoadingActivity.this,
                                        R.string.error_login_msg,
                                        Toast.LENGTH_SHORT).show();

                            }
                        else {
                            Toast.makeText(LoadingActivity.this,
                                    R.string.error_login_msg,
                                    Toast.LENGTH_SHORT).show();

                        }
                        }
                    });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });


    }


}
