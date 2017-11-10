package mondal.sanat.gitpractisedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PushThisMethodToGit()
    {
        Toast.makeText(getApplicationContext(), "Test App", Toast.LENGTH_LONG).show();
    }
}
