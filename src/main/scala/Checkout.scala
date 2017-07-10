/**
  * Created by km186064 on 10/07/2017.
  */
object Checkout {

  def totalCheckoutAmount(checkoutbasket: List[Fruit]):BigDecimal = checkoutbasket.map(_.unitPrice).sum

}
