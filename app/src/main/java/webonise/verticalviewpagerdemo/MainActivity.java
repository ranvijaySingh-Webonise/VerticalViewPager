package webonise.verticalviewpagerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Constants.ENVIRONMENT);
        initializeViewPager();
    }

    private void initializeViewPager() {
        final VerticalViewPager verticalViewPager = (VerticalViewPager) findViewById(R.id.viewPager);
        final PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        verticalViewPager.setAdapter(pagerAdapter);
    }
}
