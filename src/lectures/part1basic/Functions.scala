package lectures.part1basic

object Functions extends App{

  def aFunction(a:String, b:Int):String = {
    a + " " + b
  }

  def aParamterlessFunction():Int=42
  println(aParamterlessFunction())
  println(aFunction("hello", 4))

  def aRepeatedFunction(aString:String, n:Int):String = {
    if(n==1) aString
    else aString+aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",5))

  // when you need loops, use recursion!

  def aFunctionWithSideEffects(aString:String):Unit = println(aString)
  aFunctionWithSideEffects("james")

  def aBigFunction(n:Int):Int = {
    def aSmallFunction(a:Int,b:Int):Int =a+b
    aSmallFunction(1,4)
  }

  def aGreetingFunction(name:String,age:Int):Unit = {
    println(s"hi my name is $name and my age is $age")
  }
  aGreetingFunction("james",25)

  def Factorial(num:Int):Int ={
    if(num==1) 1
    else Factorial(num-1)*num
  }
  println(Factorial(5))

  def Fibonacci(num:Int):Int = {
    if(num<=1) 1
    else Fibonacci(num-1)+Fibonacci(num-2)
  }

  println(Fibonacci(5))

  def isPrime(num:Int):Boolean = {

    def helper(num:Int, factor:Int):Boolean = {
      if (num<=1) false
      else if (factor <= 1) true
      else if (num%factor==0 &&num!=2) false
      else helper(num, factor-1)
    }
    helper(num,num/2)
  }

  def loop(num:Int):Unit = {
    if(num==0) return
    println(s"$num" + isPrime(num))
    loop(num-1)
  }

  loop(10)


}
