package j2objclive.ae.theassembly.android.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import j2objclive.ae.theassembly.j2objc_livedemo.R;
import j2objclive.ae.theassembly.shared.presenter.ExamplePresenter;
import j2objclive.ae.theassembly.shared.view.ExampleView;

public class ExampleActivity extends AppCompatActivity implements ExampleView {

    private ExamplePresenter mPresenter;

    private EditText editText;

    private Button button;

    private TextView greetingDisplayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        editText = findViewById(R.id.greetText);
        button = findViewById(R.id.greetButton);
        greetingDisplayView = findViewById(R.id.greetingDisplayText);
        mPresenter = new ExamplePresenter(this);
        mPresenter.onCreate();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.handleClickGreetMe(editText.getText().toString());
            }
        });
    }

    @Override
    public void setGreeting(String greeting) {
        greetingDisplayView.setText(greeting);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }
}
