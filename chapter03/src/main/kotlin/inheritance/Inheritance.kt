package inheritance

import org.joda.time.DateTime
import java.math.BigDecimal


/*
  먼저 부모 클래스를 생성하자.
  1. open
    kotlin 에서는 기본적으로 상속할 수 없는 상태 (sealed)를 전제한다.
    상속 기능을 사용하기 위해서는 open 키워드를 사용하여 명시하여야 한다.
  2. 생성자(constructor)
    사용자가 명시적으로 생성자를 작성하지 않을 경우,
    컴파일러는 선언된 인자들을 가지고 자동으로 생성자를 작성한다. 이를 주 생성자라고 한다.
    만약 인자가 없으면 빈 생성자가 생성되는데, 이 때에는 주 생성자가 없다고 생각해도 될것 같다.
 */
open class Payment(val amount: BigDecimal)

/*
  inheritance 상속
    kotlin 에서는 상속 기능을 사용하기 위해 콜론(:)을 사용한다.
    
  의문 1: amount 에는 왜 val 을 붙이지 않았을까?
  답 1: Getter 또는 Setter 가 필요 없는 경우에는 접두사를 사용할 필요가 없다.
    
  의문 2: Payment 를 상속할때 왜 (amount)가 필요할까?
  답 2: CardPayment는 주 생성자를 가지고 있다.
        그러므로 Payment(amount)처럼 부모클래스의 생성자를 호출해야 한다.
 */
class CardPayment(
  amount: BigDecimal,
  val number: String,
  val expiryDate: DateTime,
  val type: CardType
) : Payment(amount)

/*
  만약 새로운 클래스가 주 생성자를 가지고 있지 않다면 어떨까?
  주 생성자를 가지고 있지 않기 때문에 두번째 생성자 정의에서 부모 클래스의 생성자를 호출해야 한다.
 */
class ChequePayment : Payment {
  
  // 두번째 생성자 정의
  constructor(amount: BigDecimal, name: String, bankId: String) : super(amount) {
    this.name = name
    this.bankId = bankId
  }
  
  // 인자는 없지만 프로퍼티는 가지고 있는 케이스.
  var name: String
  var bankId: String
}

enum class CardType {
  VISA, MASTERCARD, AMEX
}

fun main(args: Array<String>) {
  val chequePayment = ChequePayment(BigDecimal(1), "Aris", "001")
  println(chequePayment.name)
  println(chequePayment.bankId)
}
