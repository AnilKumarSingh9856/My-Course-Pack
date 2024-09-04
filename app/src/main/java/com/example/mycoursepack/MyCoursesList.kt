package com.example.mycoursepack

import androidx.annotation.DrawableRes

data class MyCoursesList(
    val ratings:Float,
    val title: String,
    @DrawableRes val thumbnail: Int,
    val body: String
)

val course1 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)

val course2 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)

val course3 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)

val course4 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)
val course5 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)
val course6 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)
val course7 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)

val course8 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)

val course9 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)
val course10 = MyCoursesList(
    4.5f,
    "The complete android 13 developer courses",
    R.drawable.ic_launcher_foreground,
    "Learn Android  App development from zero to Hero - Build 50+ app from scratch"
)

val allCourses = listOf(
    course1,
    course2,
    course3,
    course4,
    course5,
    course6,
    course7,
    course8,
    course9,
    course10

)