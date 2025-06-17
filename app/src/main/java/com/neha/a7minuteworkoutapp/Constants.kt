package com.neha.a7minuteworkoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList= ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,"Jumping Jacks ",
            R.drawable.ic_jumping_jacks_png,
            false,
            false
        )
        val highKneesRunning = ExerciseModel(
            2,"High Knees Running ",
            R.drawable.ic_high_knees_running_png,
            false,
            false
        )
        val plank = ExerciseModel(
            3,"Plank ",
            R.drawable.ic_plank_png,
            false,
            false
        )
        val pushUp = ExerciseModel(
            4,"Push Up",
            R.drawable.ic_push_up_png,
            false,
            false
        )
        val pushUpAndRotation = ExerciseModel(
            5,"Push up and Rotation ",
            R.drawable.ic_push_up_and_rotation_png,
            false,
            false
        )
        val sidePlank = ExerciseModel(
            6,"Side plank ",
            R.drawable.ic_side_plank_png,
            false,
            false
        )
        val squat = ExerciseModel(
            7,"Squat ",
            R.drawable.ic_squat_png,
            false,
            false
        )
        val tricepsOnChair = ExerciseModel(
            8,"Triceps on chair ",
            R.drawable.ic_triceps_on_chair_png,
            false,
            false
        )
        val wallSit = ExerciseModel(
            9,"Wall sit",
            R.drawable.ic_wall_sit_png,
            false,
            false
        )

        exerciseList.add(jumpingJacks)
        exerciseList.add(highKneesRunning)
        exerciseList.add(plank)
        exerciseList.add(pushUp)
        exerciseList.add(pushUpAndRotation)
        exerciseList.add(sidePlank)
        exerciseList.add(squat)
        exerciseList.add(tricepsOnChair)
        exerciseList.add(wallSit)


        return exerciseList
    }
}