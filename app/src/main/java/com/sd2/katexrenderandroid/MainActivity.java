package com.sd2.katexrenderandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sd2.katex_android.RenderLatex;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RenderLatex renderLatex = findViewById(R.id.latex);
        renderLatex.setText("$\\frac{\\lambda_c}{\\lambda_p}=\\frac{\\displaystyle\\frac h{\\sqrt{2m_eev}}}{\\frac h{\\sqrt{2m_pev}}}=\\sqrt{\\frac{m_p}{m_e}}$");
    }
}