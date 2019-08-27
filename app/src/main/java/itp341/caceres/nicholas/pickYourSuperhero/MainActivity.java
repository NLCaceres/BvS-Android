package itp341.caceres.nicholas.pickYourSuperhero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button supermanBtn;
    private Toast supermanTst;
    int supermanCnt = 1;
    private Button batmanBtn;
    private Toast batmanTst;
    int batmanCnt = 1;
    private ButtonListener clickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickListener = new ButtonListener();
        supermanBtn = (Button) findViewById(R.id.supermanBtn);
        supermanBtn.setOnClickListener(clickListener);
        batmanBtn = (Button) findViewById(R.id.batmanBtn);
        batmanBtn.setOnClickListener(clickListener);
    }

    private class ButtonListener implements OnClickListener {
        @Override
        public void onClick(View v) {
            // DO SOMETHING ABOUT IT
            switch (v.getId()) {
                case R.id.supermanBtn:
                    supermanTst.makeText(MainActivity.this, supermanCnt + " " + getResources().getString(R.string.toast_superman), supermanTst.LENGTH_SHORT).show();
                    supermanCnt++;
                    break;

                case R.id.batmanBtn:
                    batmanTst.makeText(MainActivity.this, batmanCnt + " " + getResources().getString(R.string.toast_batman), batmanTst.LENGTH_SHORT).show();
                    batmanCnt++;
                    break;
            }
        }
    }
}
