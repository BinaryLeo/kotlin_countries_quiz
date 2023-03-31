package com.example.kotlin_countries_quiz

object Constants {
    fun getQuestions() {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_australia,
            "Argentina",
            "Armenia",
            "Australia",
            "Austria",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_canada,
            "Argentina",
            "Armenia",
            "Australia",
            "Austria",
            3
        )
        questionsList.add(que2)
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_denmark,
            "Belarus",
            "Belize",
            "Bolivia",
            "Brazil",
            4
        )
        questionsList.add(que3)
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_england,
            "Belarus",
            "Belgium",
            "Belize",
            "Bolivia",
            2
        )
        questionsList.add(que4)
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_finland,
            "Gabon",
            "France",
            "Fiji",
            "Finland",
            3
        )
        questionsList.add(que5)
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_iceland,
            "Germany",
            "Georgia",
            "Greece",
            "none of these",
            1
        )

    }
}