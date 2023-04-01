package com.example.kotlin_countries_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView


class QuizQuestionsActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private var tvProgress:TextView? = null
    private var tvQuestion:TextView? = null
    private var ivImage: ImageView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        progressBar = findViewById(R.id.progress_horizontal)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_img)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)
        val questionList = Constants.getQuestions()
       // Log.i("Question list size is: ", "${questionList.size}")
        for (i in questionList) {
           // Log.e("Questions", i.question)
        }
        val currentPosition =1
        val questions: Question= questionList[currentPosition]
        progressBar?.progress = currentPosition
        tvProgress?.text = "$currentPosition" + "/" + progressBar?.max
        tvQuestion?.text = questions.question
        tvOptionOne?.text = questions.optionOne
        tvOptionTwo?.text = questions.optionTwo
        tvOptionThree?.text = questions.optionThree
        tvOptionFour?.text = questions.optionFour
        ivImage?.setImageResource(questions.image)

    }
}