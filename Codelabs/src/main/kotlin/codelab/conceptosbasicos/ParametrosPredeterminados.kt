package codelab.conceptosbasicos

fun main() {

    val operatingSystem = "Chrome OS"
    val secondUserOperatingSystem = "Windows"
    val thirdUserOperatingSystem = "Mac OS"
    val emailId = "sample@gmail.com"
    val firstUserEmailId = "user_one@gmail.com"
    val secondUserEmailId = "user_two@gmail.com"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))

    println(displayAlertMessage(email = firstUserEmailId))

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId ))

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))

}

fun displayAlertMessage(os: String = "Unknown OS", email: String): String {
    return "There's a new sign-in request on $os for your Google Account $email."
}