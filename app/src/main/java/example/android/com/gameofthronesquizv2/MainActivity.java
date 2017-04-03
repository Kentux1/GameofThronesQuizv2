package example.android.com.gameofthronesquizv2;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import example.android.com.gameofthronesquizv2.R;

import static android.R.attr.button;
import static android.R.attr.duration;
import static android.R.attr.right;
import static android.R.id.edit;
import static android.R.interpolator.linear;

public class MainActivity extends AppCompatActivity {
    int correctAnswers = 0;
    //Answers variable declaration
    //Q1
    RadioGroup groupQ1;
    RadioButton starkQ1;
    RadioButton umberQ1;
    RadioButton boltonQ1;
    RadioButton tullyQ1;
    //Q2
    EditText starkWordsQ2;
    //Q3
    CheckBox robertQ3;
    CheckBox joffreyQ3;
    CheckBox jonSnowQ3;
    CheckBox jaimeQ3;
    //Q4
    RadioGroup groupQ4;
    RadioButton robertQ4;
    RadioButton aerysQ4;
    //Q5
    RadioGroup groupQ5;
    RadioButton lannisterQ5;
    RadioButton targaryenQ5;
    //Q6
    CheckBox hodor1Q6;
    CheckBox hodor2Q6;
    CheckBox hodor3Q6;
    CheckBox hodor4Q6;
    //Q7
    RadioGroup groupQ7;
    RadioButton debtsPayedQ7;
    RadioButton hearMeRoarQ7;
    //Q8
    CheckBox renlyQ8;
    CheckBox tommenQ8;
    CheckBox joffreyQ8;
    CheckBox stannisQ8;
    //Q9
    EditText daenerysQ9;
    //Q10
    EditText numberOfDragonsQ10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find view of the correct answer of question #1
        starkQ1 = (RadioButton) findViewById(R.id.stark);
        //Find view of the correct answer of question #2
        starkWordsQ2 = (EditText) findViewById(R.id.winteriscoming);
        //Find views of the correct answers of question #3
        robertQ3 = (CheckBox) findViewById(R.id.checkbox1);
        joffreyQ3 = (CheckBox) findViewById(R.id.checkbox3);
        //Find view of the correct answer of question #4
        robertQ4 = (RadioButton) findViewById(R.id.robert);
        //Find view of the correct answer of question #5
        targaryenQ5 = (RadioButton) findViewById(R.id.targaryen);
        //Find views of the correct answers of question #6
        hodor1Q6 = (CheckBox) findViewById(R.id.hodor1);
        hodor2Q6 = (CheckBox) findViewById(R.id.hodor2);
        hodor3Q6 = (CheckBox) findViewById(R.id.hodor3);
        hodor4Q6 = (CheckBox) findViewById(R.id.hodor4);
        //Find view of the correct answer of question #7
        hearMeRoarQ7 = (RadioButton) findViewById(R.id.hearmeroar);
        //Find views of the correct answers of question #8
        renlyQ8 = (CheckBox) findViewById(R.id.renly);
        tommenQ8 = (CheckBox) findViewById(R.id.tommen);
        joffreyQ8 = (CheckBox) findViewById(R.id.joffrey);
        //Find view of the correct answer of question #9
        daenerysQ9 = (EditText) findViewById(R.id.daenerys);
        //Find view of the correct answer of question #10
        numberOfDragonsQ10 = (EditText) findViewById(R.id.numberofdragons);
        //Find views of the wrong answers and radio groups(for reset purposes)
        jonSnowQ3 = (CheckBox) findViewById(R.id.checkbox2);
        jaimeQ3 = (CheckBox) findViewById(R.id.checkbox4);
        groupQ1 = (RadioGroup) findViewById(R.id.group_q_1);
        umberQ1 = (RadioButton) findViewById(R.id.umber);
        boltonQ1 = (RadioButton) findViewById(R.id.bolton);
        tullyQ1 = (RadioButton) findViewById(R.id.tully);
        groupQ4 = (RadioGroup) findViewById(R.id.group_q_4);
        aerysQ4 = (RadioButton) findViewById(R.id.aerys);
        groupQ5 = (RadioGroup) findViewById(R.id.group_q_5);
        lannisterQ5 = (RadioButton) findViewById(R.id.lannister);
        groupQ7 = (RadioGroup) findViewById(R.id.group_q_7);
        debtsPayedQ7 = (RadioButton) findViewById(R.id.debtspayed);
        stannisQ8 = (CheckBox) findViewById(R.id.stannis);
    }
    public void submitAnswers(View view) {
        //Adds 1 to the correctAnswers if the right option is clicked
        boolean answerQ1Stark = starkQ1.isChecked();
        boolean answerQ1Umber = umberQ1.isChecked();
        boolean answerQ1Bolton = boltonQ1.isChecked();
        boolean answerQ1Tully = tullyQ1.isChecked();
        if (answerQ1Stark) {
            correctAnswers = correctAnswers +1;
            starkQ1.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
        }
        else if (answerQ1Umber){
            umberQ1.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        else if (answerQ1Bolton){
            boltonQ1.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        else if (answerQ1Tully){
            tullyQ1.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        String answerQ2 = starkWordsQ2.getText().toString().trim();
        String starkWords = getString(R.string.winteriscoming);
        if (answerQ2.equalsIgnoreCase(starkWords)){
            correctAnswers = correctAnswers + 1;
            starkWordsQ2.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
        }
        else {
            starkWordsQ2.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        boolean answer1Q3 = robertQ3.isChecked();
        boolean answer2Q3 = joffreyQ3.isChecked();
        boolean answer3Q3 = jonSnowQ3.isChecked();
        boolean answer4Q3 = jaimeQ3.isChecked();

        if (answer3Q3) {
            jonSnowQ3.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        if (answer4Q3) {
            jaimeQ3.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        if (answer1Q3) {
            robertQ3.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        if (answer2Q3) {
            joffreyQ3.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        if (answer1Q3 && answer2Q3 && !answer3Q3 && !answer4Q3) {
            correctAnswers = correctAnswers + 1;
            robertQ3.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
            joffreyQ3.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
            jaimeQ3.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
            jonSnowQ3.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        }
        boolean answerQ4Robert = robertQ4.isChecked();
        boolean answerQ4Aerys = aerysQ4.isChecked();
        if (answerQ4Robert) {
            correctAnswers = correctAnswers + 1;
            robertQ4.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
        }
        else if (answerQ4Aerys) {
            aerysQ4.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        boolean answerQ5 = targaryenQ5.isChecked();
        boolean answerQ5lannister = lannisterQ5.isChecked();
        if (answerQ5) {
            correctAnswers = correctAnswers + 1;
            targaryenQ5.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
        }
        else if (answerQ5lannister) {
            lannisterQ5.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        boolean answer1Q6 = hodor1Q6.isChecked();
        boolean answer2Q6 = hodor2Q6.isChecked();
        boolean answer3Q6 = hodor3Q6.isChecked();
        boolean answer4Q6 = hodor4Q6.isChecked();
        if (answer1Q6 || answer2Q6 || answer3Q6 || answer4Q6) {
            correctAnswers = correctAnswers + 1;
        }
        boolean answerQ7 = hearMeRoarQ7.isChecked();
        boolean answerQ7Debts = debtsPayedQ7.isChecked();
        if (answerQ7) {
            correctAnswers = correctAnswers +1;
            hearMeRoarQ7.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
        }
        else if (answerQ7Debts) {
            debtsPayedQ7.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        boolean answer1Q8 = renlyQ8.isChecked();
        boolean answer2Q8 = joffreyQ8.isChecked();
        boolean answer3Q8 = tommenQ8.isChecked();
        if (answer1Q8 && answer2Q8 && answer3Q8) {
            correctAnswers = correctAnswers + 1;
        }
        String answerQ9 = daenerysQ9.getText().toString().trim();
        String daenerys = getString(R.string.daenerys);
        if (answerQ9.equalsIgnoreCase(daenerys)){
            correctAnswers = correctAnswers + 1;
            daenerysQ9.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
        }
        else {
            daenerysQ9.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        String answerQ10 = numberOfDragonsQ10.getText().toString().trim();
        String numberOfDragons = getString(R.string.number_of_dragons);
        if (answerQ10.equalsIgnoreCase(numberOfDragons)){
            correctAnswers = correctAnswers + 1;
            numberOfDragonsQ10.setTextColor(ContextCompat.getColor(this, R.color.rightAnswer));
        }
        else {
            numberOfDragonsQ10.setTextColor(ContextCompat.getColor(this, R.color.wrongAnswer));
        }
        String correctAnswersToast = null;
        if (correctAnswers == 0) {
            correctAnswersToast = correctAnswers + " answers right??? Go to the wall!!!";
        }
        if (correctAnswers > 0 && correctAnswers < 4) {
            correctAnswersToast = "You answered " + correctAnswers + " there's no cure for being a cunt.";
        }
        if (correctAnswers > 3 && correctAnswers< 7) {
            correctAnswersToast = "You answered " + correctAnswers + " right, you might survive in Westeros...";
        }
        if (correctAnswers > 6 && correctAnswers < 10) {
            correctAnswersToast = "You answered " + correctAnswers + " right. What, are you a maester?";
        }
        if (correctAnswers == 10) {
            correctAnswersToast = "You answered " + correctAnswers + " right. Yup, you're definitely a maester.";
        }
        Toast.makeText(this, correctAnswersToast, Toast.LENGTH_LONG).show();
        correctAnswers = 0;
    }
    public void resetQuiz(View view) {
        resetQuizColors();
        groupQ1.clearCheck();
        starkWordsQ2.setText("");
        starkWordsQ2.setHint(R.string.hint1);
        robertQ3.setChecked(false);
        joffreyQ3.setChecked(false);
        jonSnowQ3.setChecked(false);
        jaimeQ3.setChecked(false);
        groupQ4.clearCheck();
        groupQ5.clearCheck();
        hodor1Q6.setChecked(false);
        hodor2Q6.setChecked(false);
        hodor3Q6.setChecked(false);
        hodor4Q6.setChecked(false);
        groupQ7.clearCheck();
        renlyQ8.setChecked(false);
        joffreyQ8.setChecked(false);
        tommenQ8.setChecked(false);
        stannisQ8.setChecked(false);
        daenerysQ9.setText("");
        daenerysQ9.setHint(R.string.hint2);
        numberOfDragonsQ10.setText("");
        numberOfDragonsQ10.setHint(R.string.hint3);
        ScrollView scroll_view = (ScrollView) findViewById(R.id.scrollview);
        scroll_view.fullScroll(ScrollView.FOCUS_UP);
        starkWordsQ2.clearFocus();
        daenerysQ9.clearFocus();
        numberOfDragonsQ10.clearFocus();
    }
    public void resetQuizColors (){
        starkQ1.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        umberQ1.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        boltonQ1.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        tullyQ1.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        starkWordsQ2.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        robertQ3.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        joffreyQ3.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        jonSnowQ3.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        jaimeQ3.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        robertQ4.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        aerysQ4.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        targaryenQ5.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        lannisterQ5.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        hodor1Q6.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        hodor2Q6.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        hodor3Q6.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        hodor4Q6.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        hearMeRoarQ7.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        debtsPayedQ7.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        renlyQ8.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        joffreyQ8.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        tommenQ8.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        stannisQ8.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        daenerysQ9.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
        numberOfDragonsQ10.setTextColor(ContextCompat.getColor(this, R.color.defaultAnswer));
    }
}
