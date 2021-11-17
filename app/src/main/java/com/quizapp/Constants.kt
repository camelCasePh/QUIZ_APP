package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Is a term used to described a new technologies?",
            "Ongoing Technologies", "Upcoming Technologies",
            "Emerging Technologies", "Amazing technologies", 3
        )

        questionsList.add(que1)



        // 2
        val que2 = Question(
            2, "It was a period of major industrialization and innovation?",
            "Paleolithic period", "Neolithic period",
            "Industrial period", "Industrial Revolution", 4
        )

        questionsList.add(que2)




        // 3
        val que3 = Question(
            3, "All are emerging technologies except?",
            "Artificial Intelligence", "Iot",
            "Augmented Reality", "Tong its", 4
        )

        questionsList.add(que3)


        // 4
        val que4 = Question(
            4, "Data is regarded as the new (BLANK) strategic asset.",
            "change", "oil",
            "water", "power", 2
        )

        questionsList.add(que4)


        // 5
        val que5 = Question(
            5, "Studies the design of interface between users and computers?",
            "UX/UI Design", "Artificial Intelligence",
            "User-centered Design", "Human to computer Interaction", 4
        )

        questionsList.add(que5)




        // 6
        val que6 = Question(
            6, "All are disciplines contributing ot HCI except:",
            "Artificial Intelligence", "Computer Science",
            "Engineering and Design", "Electrical Engineering", 4
        )

        questionsList.add(que6)


        // 7
        val que7 = Question(
            7, "All are future trends in emerging technologies except:",
            "5G networks", "blockchain",
            "Augmented Analytics", "Traffic light", 4
        )

        questionsList.add(que7)


        // 8
        val que8 = Question(
            8, "It is a raw or unprocessed facts and figures?",
            "data", "information",
            "hearsay's", "none of these", 1
        )

        questionsList.add(que8)


        // 9
        val que9 = Question(
            9, "data processing consist of the following basic steps except:",
            "input", "initializing",
            "processing", "output", 2
        )


        questionsList.add(que9)


        // 10
        val que10 = Question(
            10, "Big Data is can be characterized by the following except:",
            "Volume", "Velocity",
            "Varsity", "Veracity", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}