fun main() {

    var musicByer: Int = 20000

    var melomanStatus: Boolean = true

    val firstCategory: Int = 1000
    val secondCategory: Int = 10_000
    val discountOnePersent: Double = 0.01
    val discountFivePersent: Double = 0.05
    val discount100Rub: Int = 100
    var discount: Int = 0
    var meloman: Int = 0
    var chequeText: String = "null"


    if (musicByer <= firstCategory) {
        chequeText = "Сумма вашего заказа составила: $musicByer"
    } else if (musicByer > firstCategory && musicByer <= secondCategory) {
        discount = musicByer - discount100Rub
        chequeText = """ Сумма вашего заказа составила: $musicByer
            | Сумма чека с учетом скидки: $discount""".trimMargin()
    } else if (musicByer > secondCategory) {
        discount = (musicByer - musicByer * discountFivePersent).toInt()
        chequeText = """ Сумма вашего заказа составила: $musicByer
            | Сумма чека с учетом скидки: $discount""".trimMargin()
    }
    if (melomanStatus) {
        meloman = (discount - discount * discountOnePersent).toInt()
        chequeText += """ рублей  
            | Сумма чека с учетом скидки меломана составляет $meloman рублей""".trimMargin()
    }
    println(chequeText)
}