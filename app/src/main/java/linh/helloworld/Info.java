package linh.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Info extends AppCompatActivity {
    @BindView(R.id.textAddress) TextView txtAddress;
    @BindView(R.id.textName) TextView textViewName;
    @BindView(R.id.textTel) TextView textTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        textViewName.setText(bundle.getInt("Gender"));
    }
}
