package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS :  String = "correct_answers"

    fun getQuestions():ArrayList<Question>
    {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Germany",
            "Finland",
            "Russia",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Kongo",
            "U.S.A",
            "Canada",
            "Australia",
            2
        )
        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Brazil",
            "Belgium",
            "Denmark",
            "Kuwait",
            2
        )
        questionsList.add(que3)
        return questionsList
    }

}