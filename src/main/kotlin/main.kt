fun main() {
    val firstCategory: Int = 1000
    val secondCategory: Int = 10_000
    val discountOnePersent: Double = 0.01
    val discountFivePersent: Double = 0.05
    val discount100Rub: Int = 100

    var musicSale: Int = 15000
    var regularCustomer: Boolean = true

    if (musicSale > 0 && musicSale < firstCategory && regularCustomer) {
        println(
            """Общая сумма заказа составляет $musicSale рублей
                |Ваш заказ со скидкой постоянного клиента составил 
             """.trimMargin() + (musicSale - musicSale * discountOnePersent) + " рублей"
        )
    } else if (musicSale > 0 && musicSale < firstCategory && regularCustomer == false) {
        println("Ваш заказ составляет $musicSale рублей")
    } else if (musicSale > firstCategory && musicSale < secondCategory && regularCustomer) {
        println("Общая сумма заказа составляет $musicSale рублей")
        println("Сумма заказа со скидкой 100 рублей составила " + (musicSale - discount100Rub) + " рублей")
        println("Ваш заказ со скидкой постоянного клиента составил " + (musicSale - (musicSale - discount100Rub) * discountOnePersent))
    } else if (musicSale > firstCategory && musicSale < secondCategory && regularCustomer == false) {
        println("Ваш заказ составляет $musicSale рублей")
        println("Сумма заказа со скидкой 100 рублей составила " + (musicSale - discount100Rub) + " рублей")
    } else if (musicSale > secondCategory && regularCustomer) {
        println("Ваш заказ составляет $musicSale рублей")
        println("Сумма заказа со скидкой 5% составила " + (musicSale - musicSale * discountFivePersent) + " рублей")
        println("Ваш заказ со скидкой постоянного клиента составил " + (musicSale - musicSale * discountFivePersent -
                musicSale * discountOnePersent))
    } else if (musicSale > secondCategory && regularCustomer == false) {
        println("Ваш заказ составляет $musicSale рублей")
        println("Сумма заказа со скидкой 5% составила " + (musicSale - musicSale * discountFivePersent) + " рублей")
    }
}