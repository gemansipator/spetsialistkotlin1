// коментарий
/*
* множественный комментарий
 */

/*
/*
вложенный комментарий
 */
 */
val firstName : String = "Masha"
var LastName = "Ivanova"
var age = 25
const val DEBUG = true

fun main()
{
    // firstName = "Dasha" - так нельзя изза того что val
    age = 26

    //age = "twenty" - так нельзя, потому что age это Int
/*
    val tepmerature = 26
    val condition = if(tepmerature < -5)
        "Холодно"
    else if(tepmerature < 5)
        "Около нуля"
    else
        "Жарко как в пустыне"
*/
    val tepmerature = 26
    val condition = when {
        tepmerature < -5 -> "Холодно"
        tepmerature < 5 -> "Около нуля"
        else -> "Жарко как в пустыне"
    }


    print(condition)
}