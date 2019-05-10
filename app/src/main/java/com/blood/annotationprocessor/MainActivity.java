package com.blood.annotationprocessor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.blood.annotationprocessor.runtime.GET;
import com.blood.annotationprocessor.runtime.RuntimeTest;
import com.blood.annotations.Bind;

import java.lang.reflect.Method;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.runtime)
    Button mRuntime;

    @Bind(value = R.id.compile)
    Button mCompile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.runtime)
    public void onViewClicked() {
        processRuntimeAnnotation();
    }

    private void processRuntimeAnnotation() {
        Method[] methods = RuntimeTest.class.getDeclaredMethods();
        for (Method method : methods) {
            GET get = method.getAnnotation(GET.class);
            String url = get.url();
            Toast.makeText(this, url, Toast.LENGTH_SHORT).show();
        }
    }
}
