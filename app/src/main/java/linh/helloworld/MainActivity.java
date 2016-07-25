package linh.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textName)
    EditText textName;
    @BindView(R.id.textAddress)
    EditText textAddress;
    @BindView(R.id.textTel)
    EditText textTel;
    @BindView(R.id.radioGender)
    RadioGroup radioGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick ({R.id.btnSave, R.id.btnClear})
    public void btnSave(View view) {
        switch (view.getId())
        {
            case R.id.btnSave:
                final Intent intent = new Intent(getApplicationContext(),Info.class);
                intent.putExtra("Name",textName.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("Name",textName.getText().toString());
                bundle.putString("Address",textAddress.getText().toString());
                bundle.putString("Tel",textTel.getText().toString());
                bundle.putInt("Gender",radioGender.getCheckedRadioButtonId());
                startActivity(intent);
                break;
            case R.id.btnClear:
                this.recreate();
                break;
        }

    }



}
