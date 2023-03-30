package com.example.gamesport

object QuestionList {

    fun getQuestions(): MutableList<Question> {
        val question = mutableListOf<Question>()

        question.add(
            Question(
                id = 0,
                pictureList = mutableListOf(
                    R.drawable.img_1_1,
                    R.drawable.img_1_2,
                    R.drawable.img_1_3,
                    R.drawable.img_1_4
                ),
                answer = "FOOTBALL"
            )
        )

        question.add(
            Question(
                id = 1,
                pictureList = mutableListOf(
                    R.drawable.img_2_1,
                    R.drawable.img_2_2,
                    R.drawable.img_2_3,
                    R.drawable.img_2_4
                ),
                answer = "TRIATLON"
            )
        )

        question.add(
            Question(
                id = 2,
                pictureList = mutableListOf(
                    R.drawable.img_3_1,
                    R.drawable.img_3_2,
                    R.drawable.img_3_3,
                    R.drawable.img_3_4
                ),
                answer = "FORMULA1"
            )
        )

        question.add(
            Question(
                id = 3,
                pictureList = mutableListOf(
                    R.drawable.img_4_1,
                    R.drawable.img_4_2,
                    R.drawable.img_4_3,
                    R.drawable.img_4_4
                ),
                answer = "AIRSOFT"
            )
        )

        question.add(
            Question(
                id = 4,
                pictureList = mutableListOf(
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background
                ),
                answer = "NOQAT"
            )
        )

        return question
    }
}