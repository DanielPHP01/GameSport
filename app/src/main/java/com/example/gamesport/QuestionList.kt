package com.example.gamesport

object QuestionList {

    fun getQuestions(): MutableList<Question> {
        val question = mutableListOf<Question>()

        question.add(
            Question(
                id = 0,
                pictureList = mutableListOf(
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background
                ),
                answer = "QQQQQQ"
            )
        )

        question.add(
            Question(
                id = 1,
                pictureList = mutableListOf(
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background
                ),
                answer = "SHAWQIM"
            )
        )

        question.add(
            Question(
                id = 2,
                pictureList = mutableListOf(
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background
                ),
                answer = "ISSI"
            )
        )

        question.add(
            Question(
                id = 3,
                pictureList = mutableListOf(
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background,
                    R.drawable.ic_launcher_background
                ),
                answer = "MUZIKA"
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