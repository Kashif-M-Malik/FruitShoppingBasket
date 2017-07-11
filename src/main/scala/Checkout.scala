/**
  * Created by km186064 on 10/07/2017.
  */
object Checkout extends App with BuyOneGetAnotherForFree with BuyThreeForThePriceOfTwo{

  //I have assumed the below checkout basket, to show the output from it.
  val checkoutItems = List(Apple,Orange,Orange,Apple,Apple,Apple,Apple,Orange,Orange,Apple)

  def totalCheckoutAmount(checkoutBasket: List[Fruit]):BigDecimal = checkoutBasket.map(_.unitPrice).sum
  def totalCheckoutAmountConsideringOffers(checkoutBasket: List[Fruit]):BigDecimal = {

    val amountAfterBuyOneGetAnotherForFreeDiscount:BigDecimal =
      if(checkoutBasket.contains(Apple)) buyOneGetOneFreeDiscount(Apple,checkoutBasket) else 0
    val amountAfterBuyThreeGetOneForFreeDiscount:BigDecimal =
      if(checkoutBasket.contains(Orange)) buyThreeForThePriceOfTwoDiscount(Orange,checkoutBasket) else 0
    val totalAmount = amountAfterBuyOneGetAnotherForFreeDiscount + amountAfterBuyThreeGetOneForFreeDiscount
    totalAmount
  }

  //The output of running this application shows ( with offers ) total amount calculations
  val amountPayableAfterOffers = totalCheckoutAmountConsideringOffers(checkoutItems)
  println(s"The total amount payable after applying the offers is: $amountPayableAfterOffers")
}
