package vn.edu.fpt.studyday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_login);
        EditText edt_user = findViewById(R.id.edt_user);
        EditText edt_pass = findViewById(R.id.edt_pass);
        TextView tv_show = findViewById(R.id.tv_show);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show.setText(edt_user.getText() + "/" + edt_pass.getText());
//                btn.setText("Clicked");
                ((Button)v).setText("Clicked");
            }
        });
    }
}