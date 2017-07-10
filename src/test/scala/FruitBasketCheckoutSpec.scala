import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by km186064 on 10/07/2017.
  */
class FruitBasketCheckoutSpec extends FlatSpec with Matchers {


  "An orange only checkout basket with a single orange" should
  "have a total amount" in {
    val orangeBasket = List(Orange)
    Checkout.totalCheckoutAmount(orangeBasket) should be (0.25)
  }

  "An orange only checkout basket with two oranges" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange)
    Checkout.totalCheckoutAmount(orangeBasket) should be (0.50)
  }

  "A checkout basket with two oranges and two apples" should
  "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Apple, Apple)
    Checkout.totalCheckoutAmount(orangeBasket) should be (1.70)
  }

  "An empty checkout basket" should
      "have a total amount" in {
    val orangeBasket = List()
    Checkout.totalCheckoutAmount(orangeBasket) should be (0)
  }

}