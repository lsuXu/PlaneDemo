package test.xu.cn.planedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Namuh on 2017/8/29.
 */

public class LoginActivity extends AppCompatActivity {
    private Button BtnLoginIn ;
    private TextView BtnRegister ;
    private TextView BtnForgetPSD ;
    private EditText User ;
    private EditText Password ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        initialize();
    }
    private void initialize(){
        BtnLoginIn = (Button) findViewById(R.id.btn_login_in);
        BtnRegister = (TextView) findViewById(R.id.btn_login_register);
        BtnForgetPSD = (TextView) findViewById(R.id.btn_login_forget_psd);
        User = (EditText) findViewById(R.id.edit_login_user);
        Password = (EditText) findViewById(R.id.edit_login_psd);
    }
    private class Listener implements View.OnClickListener{
        @Override
        public void onClick(View v) {

        }
    }
}
