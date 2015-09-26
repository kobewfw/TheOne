package smallzoo.com.shengchen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DocumentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);
    }

    public void click(View view){
        finish();
    }
}
