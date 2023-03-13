package lectures.part1basic

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App{

  def factorial(n:Int):Int = {
    if(n<=1) 1
    else{
      println("compute factorial of"+n+"- I first need factorial"+(n-1))
      val res = n*factorial(n-1)
      println("compute factorial of "+n)
      res
    }
  }
//  factorial(10)

  // better eay tail recursion, no need to use extra stack
  def anotherFactorial(n:Int):Int = {
    @tailrec
    def factHelper(x:Int, accumulator:Int):Int =
      if (x<=1) accumulator
      else factHelper(x-1,x*accumulator)
    factHelper(n,1)
  }

  // concatenate a string n times
  def concatenateString(s:String, n:Int):String = {
    @tailrec
    def helper(remain:Int, accumulator: String, s:String):String =
      if(remain<1) accumulator
      else helper(remain-1,accumulator+s,s)
    helper(n,s,s)
  }
  println(concatenateString("h",2))

//  def TailIsPrime(n:Int):Boolean = {
//    @tailrec
//    def helper(n:Int, accumulator: Int):Boolean = {
//      if(accumulator<=1) true
//      else if(n%accumulator==0) false
//      else helper(n, accumulator-1)
//    }
//    helper(n,n/2)
//  }
//  println(TailIsPrime(2003))
  def isprimetail(n:Int):Boolean = {
    def isPrimeHelper(t:Int,isStillPrime:Boolean):Boolean ={
      if (!isStillPrime) false
      else if (t<=1) true
      else isPrimeHelper(t-1,n%t!=0&&isStillPrime)
    }

    isPrimeHelper(n/2,true)

}

  def Tailfibonacci(n:Int):Int = {
    @tailrec
    def helper(n:Int, accumulator1:Int, accumulator2: Int):Int = {
      if(n<=1) accumulator1
      else helper(n-1,accumulator2,accumulator1+accumulator2)
    }

    helper(n,1,1)
  }

  println(Tailfibonacci(8))


}
