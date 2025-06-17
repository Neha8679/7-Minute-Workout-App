package com.neha.a7minuteworkoutapp



object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList= ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,"Jumping Jacks ",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)
        val highKneesRunning = ExerciseModel(
            2,"High Knees Running ",
            R.drawable.ic_high_knees_running,
            false,
            false
        )
        exerciseList.add(highKneesRunning)
        val plank = ExerciseModel(
            3,"Plank ",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(plank)
        val pushUp = ExerciseModel(
            4,"Push Up",
            R.drawable.ic_push_up,
            false,
            false
        )
        exerciseList.add(pushUp)
        val pushUpAndRotation = ExerciseModel(
            5,"Push up and Rotation ",
            R.drawable.ic_push_up_and_rotation,
            false,
            false
        )
        exerciseList.add(pushUpAndRotation)
        val sidePlank = ExerciseModel(
            6,"Side plank ",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)
        val squat = ExerciseModel(
            7,"Squat ",
            R.drawable.ic_squat,
            false,
            false
        )
        exerciseList.add(squat)
        val tricepsOnChair = ExerciseModel(
            8,"Triceps on chair ",
            R.drawable.ic_triceps_on_chair,
            false,
            false
        )

        exerciseList.add(tricepsOnChair)
//        val wallSit = ExerciseModel(
//            9,"Wall sit",
//            R.drawable.ic_wall_sit,
//            false,
//            false
//        )
//        exerciseList.add(wallSit)
        val lunge = ExerciseModel(
            10,"Lunge",
            R.drawable.ic_lunges,
            false,
            false
        )
        exerciseList.add(lunge)




        return exerciseList
    }
}