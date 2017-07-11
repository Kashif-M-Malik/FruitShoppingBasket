/**
  * Created by km186064 on 10/07/2017.
  */
trait BuyOneGetAnotherForFree {

  def buyOneGetOneFreeDiscount(buyOneGetOneFreeFruit: Fruit, shoppingBasket: List[Fruit]): BigDecimal = {

    val fruitQuantityInBasket = shoppingBasket.filter(_.name == buyOneGetOneFreeFruit.name).size
    val fruitQuantityToCalculateTotalBillAmount =
      if (fruitQuantityInBasket > 1 && fruitQuantityInBasket % 2 == 0) fruitQuantityInBasket - ( fruitQuantityInBasket / 2 )
      else if (fruitQuantityInBasket > 1 && fruitQuantityInBasket % 2 == 1) fruitQuantityInBasket - ((fruitQuantityInBasket - 1) / 2 )
      else if (fruitQuantityInBasket == 1 ) fruitQuantityInBasket
      else 0

    fruitQuantityToCalculateTotalBillAmount * buyOneGetOneFreeFruit.unitPrice

  }
}

trait BuyThreeForThePriceOfTwo {

  def buyThreeForThePriceOfTwoDiscount(buyThreeForThePriceOfTwoFruit:Fruit, shoppingBasket:List[Fruit]):BigDecimal = {

    val fruitQuantityInBasket = shoppingBasket.filter(_.name == buyThreeForThePriceOfTwoFruit.name).size
    val fruitQuantityToCalculateTotalBillAmount =
      if (fruitQuantityInBasket > 2 && fruitQuantityInBasket % 3 == 0) fruitQuantityInBasket - ( fruitQuantityInBasket / 3 )
      else if (fruitQuantityInBasket > 2 && ( fruitQuantityInBasket % 3 == 1 || fruitQuantityInBasket % 3 == 2 ) ) (fruitQuantityInBasket) - ((fruitQuantityInBasket - 1 ) / 3 )
      else if (fruitQuantityInBasket == 1 || fruitQuantityInBasket == 2 ) fruitQuantityInBasket
      else 0

    fruitQuantityToCalculateTotalBillAmount * buyThreeForThePriceOfTwoFruit.unitPrice

  }

}
