package tech.linard.android.meuportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_project_1).setOnClickListener(this);
        findViewById(R.id.button_project_2).setOnClickListener(this);
        findViewById(R.id.button_project_3).setOnClickListener(this);
        findViewById(R.id.button_project_4).setOnClickListener(this);
        findViewById(R.id.button_project_5).setOnClickListener(this);
        findViewById(R.id.button_project_6).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String toastMessage = null;
        Button b = (Button) findViewById(view.getId());
        toastMessage = "This button will launch my "
                + b.getText().toString()
                + " project!";
        switch (view.getId()) {
            case R.id.button_project_1:
                performToast(toastMessage);
                break;
            case R.id.button_project_2:
                performToast(toastMessage);
                break;
            case R.id.button_project_3:
                performToast(toastMessage);
                break;
            case R.id.button_project_4:
                performToast(toastMessage);
                break;
            case R.id.button_project_5:
                performToast(toastMessage);
                break;
            case R.id.button_project_6:
                performToast(toastMessage);
                break;
        }

    }
    private void performToast(String message) {
        Toast.makeText(MainActivity.this, message,
                Toast.LENGTH_SHORT).show();
    }
}

