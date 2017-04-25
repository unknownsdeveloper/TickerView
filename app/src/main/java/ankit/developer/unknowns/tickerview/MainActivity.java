package ankit.developer.unknowns.tickerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

public class MainActivity extends AppCompatActivity {
    int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TickerView tickerView = (TickerView)findViewById(R.id.tickerView);
        tickerView.setCharacterList(TickerUtils.getDefaultNumberList());
        Button btnClickme = (Button)findViewById(R.id.btnClickme);
        btnClickme.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                tickerView.setText(""+(++value));

            }

        });
    }
}
