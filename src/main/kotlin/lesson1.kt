// коментарий
/*
* множественный комментарий
 */

/*
/*
вложенный комментарий
 */
 */
//val firstName : String = "Masha"
//var LastName = "Ivanova"
var age = 25
//const val DEBUG = true

fun main()
{
    //firstName = "Dasha" - так нельзя изза того что val
    age = 26

    // age = "twenty" // - так нельзя, потому что age это Int
/*
    val tepmerature = 26
    val condition = if(tepmerature < -5)
        "Холодно"
    else if(tepmerature < 5)
        "Около нуля"
    else
        "Жарко как в пустыне"

*/
    /*
    val tepmerature = 5
    val condition = when {
        tepmerature < -5 -> "Холодно"
        tepmerature <= 5 -> "Около нуля"
        else -> "Жарко как в пустыне"

    }
    print(condition)
*/
    // nullable
//    var position : String? = "programmer"
//        position = null
//    if (position != null)
//        println("Length is " + position.length)
//    println("Length is " + position?.length)
//
//    //println("Length is " + position?.length)  //знак вопроса делает так
//// что если position не равен НУЛЮ то выполняется .length
//// (вычисление количества знаков)...
//    println(position?.length ?: 0) // если выполняется левая
// сторона от последнего знака вопроса то есть все равно nuul то выводит ноль
    val obj : Any = "15"

    if (obj is String) // smart cast
    {
        println("Len is " + obj.length)
    }
    val x: String  = obj as String  // unsafe cast  переменная x типа стринг присвоить obg приведенное к типу стринг

    // val z: String = age as String    // выскакивает ошибка ClassCastException

    val k: String? = age as? String   //безопасное приведение типов. Если через as? тип
    // переменной не переходит в String то благодаря знаку ? возвращается null
    print(k)


}
