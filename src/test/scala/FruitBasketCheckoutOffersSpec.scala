import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by km186064 on 10/07/2017.
  */
class FruitBasketCheckoutOffersSpec extends FlatSpec with Matchers {

  "An orange only checkout basket with a single orange" should
      "have a total amount" in {
    val orangeBasket = List(Orange)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (0.25)
  }

  "An orange only checkout basket with two oranges" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (0.50)
  }

  "An orange only checkout basket with three oranges" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Orange)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (0.50)
  }

  "An orange only checkout basket with four oranges" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Orange, Orange)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (0.75)
  }

  "An orange only checkout basket with five oranges" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Orange, Orange, Orange)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (1.00)
  }

  "An orange only checkout basket with six oranges" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Orange, Orange, Orange, Orange)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (1.00)
  }

  "An apple only checkout basket with a single apple" should
      "have a total amount" in {
    val appleBasket = List(Apple)
    Checkout.totalCheckoutAmountConsideringOffers(appleBasket) should be (0.60)
  }

  "An apple only checkout basket with two apples" should
      "have a total amount" in {
    val appleBasket = List(Apple, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(appleBasket) should be (0.60)
  }

  "An apple only checkout basket with three apples" should
      "have a total amount" in {
    val appleBasket = List(Apple, Apple, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(appleBasket) should be (1.20)
  }

  "An apple only checkout basket with four apples" should
      "have a total amount" in {
    val appleBasket = List(Apple, Apple, Apple, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(appleBasket) should be (1.20)
  }

  "A checkout basket with one orange and one apple" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (0.85)
  }

  "A checkout basket with two oranges and one apple" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (1.10)
  }

  "A checkout basket with one orange and two apples" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Apple, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (0.85)
  }

  "A checkout basket with two oranges and two apples" should
  "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Apple, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (1.10)
  }

  "A checkout basket with three oranges and two apples" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Orange, Apple, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (1.10)
  }

  "A checkout basket with three oranges and three apples" should
      "have a total amount" in {
    val orangeBasket = List(Orange, Orange, Orange, Apple, Apple, Apple)
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (1.70)
  }

  "An empty checkout basket" should
      "have a total amount" in {
    val orangeBasket = List()
    Checkout.totalCheckoutAmountConsideringOffers(orangeBasket) should be (0)
  }

}
