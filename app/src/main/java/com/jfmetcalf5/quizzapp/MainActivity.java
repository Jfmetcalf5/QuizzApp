package com.jfmetcalf5.quizzapp;

import android.app.Application;
import android.content.Context;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int onQuestion = 1;
    int correctAnswer = 1;

    int totalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateTheViews();
    }

    public void EditSubmit(View v) {
        EditText editText = grabEditText(R.id.Edit1);
        if (editText.getText().toString().equals(".setImageResource();")) {
            totalScore += 1;
            Toast.makeText(MainActivity.this, "Correct! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Incorrect! Score = " + totalScore + "\nAnswer = .setImageResource();", Toast.LENGTH_LONG).show();
        }
        goToNextQuestion();
        updateTheViews();
    }

    public void SubmitButton(View v) {
        CheckBox C1 = grabCheckButton(R.id.CA1);
        CheckBox C2 = grabCheckButton(R.id.CA2);
        CheckBox C3 = grabCheckButton(R.id.CA3);
        CheckBox C4 = grabCheckButton(R.id.CA4);

        if ((C1.isChecked() == true) && (C2.isChecked() == false) && (C3.isChecked() == false) && (C4.isChecked() == true)) {
            totalScore += 1;
            Toast.makeText(MainActivity.this,"Correct! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"Incorrect! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        }
        goToNextQuestion();
        updateTheViews();
    }

    public void R1 (View v) {
        if (correctAnswer == 1) {
            totalScore += 1;
            Toast.makeText(MainActivity.this,"Correct! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"Incorrect! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        }
        goToNextQuestion();
        updateTheViews();
    }

    public void R2 (View v) {
        if (correctAnswer == 2) {
            totalScore += 1;
            Toast.makeText(MainActivity.this,"Correct! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"Incorrect! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        }
        goToNextQuestion();
        updateTheViews();
    }

    public void R3 (View v) {
        if (correctAnswer == 3) {
            totalScore += 1;
            Toast.makeText(MainActivity.this,"Correct! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"Incorrect! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        }
        goToNextQuestion();
        updateTheViews();
    }

    public void R4 (View v) {
        if (correctAnswer == 4) {
            totalScore += 1;
            Toast.makeText(MainActivity.this,"Correct! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"Incorrect! Score = " + totalScore, Toast.LENGTH_SHORT).show();
        }
        goToNextQuestion();
        updateTheViews();
    }

    private void goToNextQuestion() {
        if (onQuestion == 6) {
            Toast.makeText(MainActivity.this,"Congratulations!  Your final Score is " + totalScore, Toast.LENGTH_LONG).show();
            onQuestion = 1;
        } else{
            onQuestion += 1;
        }
    }

    private void deselectRadioButtons() {
        RadioButton R1 = grabRadioButton(R.id.RA1);
        RadioButton R2 = grabRadioButton(R.id.RA2);
        RadioButton R3 = grabRadioButton(R.id.RA3);
        RadioButton R4 = grabRadioButton(R.id.RA4);

        R1.setChecked(false);
        R2.setChecked(false);
        R3.setChecked(false);
        R4.setChecked(false);

        CheckBox C1 = grabCheckButton(R.id.CA1);
        CheckBox C2 = grabCheckButton(R.id.CA2);
        CheckBox C3 = grabCheckButton(R.id.CA3);
        CheckBox C4 = grabCheckButton(R.id.CA4);

        C1.setChecked(false);
        C2.setChecked(false);
        C3.setChecked(false);
        C4.setChecked(false);

    }

    private void updateTheViews() {
        deselectRadioButtons();
        TextView Question = grab(R.id.Question);

        Button button = (Button) findViewById(R.id.SubmitButton);
        Button submitEdit = (Button) findViewById(R.id.SubmitEditButton);

        RadioButton R1 = grabRadioButton(R.id.RA1);
        RadioButton R2 = grabRadioButton(R.id.RA2);
        RadioButton R3 = grabRadioButton(R.id.RA3);
        RadioButton R4 = grabRadioButton(R.id.RA4);

        CheckBox C1 = grabCheckButton(R.id.CA1);
        CheckBox C2 = grabCheckButton(R.id.CA2);
        CheckBox C3 = grabCheckButton(R.id.CA3);
        CheckBox C4 = grabCheckButton(R.id.CA4);

        EditText E1 = grabEditText(R.id.Edit1);

        TextView A1 = grab(R.id.A1);
        TextView A2 = grab(R.id.A2);
        TextView A3 = grab(R.id.A3);
        TextView A4 = grab(R.id.A4);

        if (onQuestion == 1) {
            button.setVisibility(View.GONE);
            submitEdit.setVisibility(View.GONE);
            E1.setVisibility(View.GONE);
            Question.setText(R.string.Q1);
            A1.setText(R.string.Q1A1);
            A2.setText(R.string.AQ1A2);
            A3.setText(R.string.Q1A3);
            A4.setText(R.string.Q1A4);
            A1.setVisibility(View.VISIBLE);
            A2.setVisibility(View.VISIBLE);
            A3.setVisibility(View.VISIBLE);
            A4.setVisibility(View.VISIBLE);
            R1.setVisibility(View.VISIBLE);
            R2.setVisibility(View.VISIBLE);
            R3.setVisibility(View.VISIBLE);
            R4.setVisibility(View.VISIBLE);
            C1.setVisibility(View.GONE);
            C2.setVisibility(View.GONE);
            C3.setVisibility(View.GONE);
            C4.setVisibility(View.GONE);
            correctAnswer = 2;
        } else if (onQuestion == 2) {
            button.setVisibility(View.GONE);
            submitEdit.setVisibility(View.VISIBLE);
            E1.setVisibility(View.VISIBLE);
            Question.setText(R.string.Q2);
            E1.setHint(R.string.EditText);
            A1.setVisibility(View.GONE);
            A2.setVisibility(View.GONE);
            A3.setVisibility(View.GONE);
            A4.setVisibility(View.GONE);
            R1.setVisibility(View.GONE);
            R2.setVisibility(View.GONE);
            R3.setVisibility(View.GONE);
            R4.setVisibility(View.GONE);
            C1.setVisibility(View.GONE);
            C2.setVisibility(View.GONE);
            C3.setVisibility(View.GONE);
            C4.setVisibility(View.GONE);
            correctAnswer = 2;
        } else if (onQuestion == 3) {
            button.setVisibility(View.GONE);
            submitEdit.setVisibility(View.GONE);
            E1.setVisibility(View.GONE);
            Question.setText(R.string.Q3);
            A1.setText(R.string.Q3A1);
            A2.setText(R.string.Q3A2);
            A3.setText(R.string.AQ3A3);
            A4.setText(R.string.Q3A4);
            A1.setVisibility(View.VISIBLE);
            A2.setVisibility(View.VISIBLE);
            A3.setVisibility(View.VISIBLE);
            A4.setVisibility(View.VISIBLE);
            R1.setVisibility(View.VISIBLE);
            R2.setVisibility(View.VISIBLE);
            R3.setVisibility(View.VISIBLE);
            R4.setVisibility(View.VISIBLE);
            C1.setVisibility(View.GONE);
            C2.setVisibility(View.GONE);
            C3.setVisibility(View.GONE);
            C4.setVisibility(View.GONE);
            correctAnswer = 3;
        } else if (onQuestion == 4) {
            button.setVisibility(View.VISIBLE);
            submitEdit.setVisibility(View.GONE);
            E1.setVisibility(View.GONE);
            Question.setText(R.string.Q4);
            A1.setText(R.string.AQ4A1);
            A2.setText(R.string.Q4A2);
            A3.setText(R.string.Q4A3);
            A4.setText(R.string.AQ4A4);
            A1.setVisibility(View.VISIBLE);
            A2.setVisibility(View.VISIBLE);
            A3.setVisibility(View.VISIBLE);
            A4.setVisibility(View.VISIBLE);
            R1.setVisibility(View.GONE);
            R2.setVisibility(View.GONE);
            R3.setVisibility(View.GONE);
            R4.setVisibility(View.GONE);
            C1.setVisibility(View.VISIBLE);
            C2.setVisibility(View.VISIBLE);
            C3.setVisibility(View.VISIBLE);
            C4.setVisibility(View.VISIBLE);
            correctAnswer = 4;
        } else if (onQuestion == 5) {
            button.setVisibility(View.GONE);
            submitEdit.setVisibility(View.GONE);
            E1.setVisibility(View.GONE);
            Question.setText(R.string.Q5);
            A1.setText(R.string.Q5A1);
            A2.setText(R.string.AQ5A2);
            A3.setText(R.string.Q5A3);
            A4.setText(R.string.Q5A4);
            A1.setVisibility(View.VISIBLE);
            A2.setVisibility(View.VISIBLE);
            A3.setVisibility(View.VISIBLE);
            A4.setVisibility(View.VISIBLE);
            R1.setVisibility(View.VISIBLE);
            R2.setVisibility(View.VISIBLE);
            R3.setVisibility(View.VISIBLE);
            R4.setVisibility(View.VISIBLE);
            C1.setVisibility(View.GONE);
            C2.setVisibility(View.GONE);
            C3.setVisibility(View.GONE);
            C4.setVisibility(View.GONE);
            correctAnswer = 2;
        } else if (onQuestion == 6) {
            button.setVisibility(View.GONE);
            submitEdit.setVisibility(View.GONE);
            E1.setVisibility(View.GONE);
            Question.setText(R.string.Q6);
            A1.setText(R.string.AQ6A1);
            A2.setText(R.string.Q6A2);
            A3.setText(R.string.Q6A3);
            A4.setText(R.string.Q6A4);
            A1.setVisibility(View.VISIBLE);
            A2.setVisibility(View.VISIBLE);
            A3.setVisibility(View.VISIBLE);
            A4.setVisibility(View.VISIBLE);
            R1.setVisibility(View.VISIBLE);
            R2.setVisibility(View.VISIBLE);
            R3.setVisibility(View.VISIBLE);
            R4.setVisibility(View.VISIBLE);
            C1.setVisibility(View.GONE);
            C2.setVisibility(View.GONE);
            C3.setVisibility(View.GONE);
            C4.setVisibility(View.GONE);
            correctAnswer = 1;
        }

        scrollToTop();
    }

    private void scrollToTop() {
        ScrollView scrollView = (ScrollView) findViewById(R.id.QuizzScrollView);
        scrollView.fullScroll(ScrollView.FOCUS_UP);
    }

    private TextView grab(int idHere) {
        TextView textView = (TextView) findViewById(idHere);
        return textView;
    }

    private RadioButton grabRadioButton(int idHere) {
        RadioButton radioButton = (RadioButton) findViewById(idHere);
        return radioButton;
    }

    private CheckBox grabCheckButton(int idHere) {
        CheckBox checkBox = (CheckBox) findViewById(idHere);
        return checkBox;
    }

    private EditText grabEditText(int idHere) {
        EditText editText = (EditText) findViewById(idHere);
        return editText;
    }
}
