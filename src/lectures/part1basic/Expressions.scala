package lectures.part1basic

object Expressions extends App{
//  print(2>>1)
  // ! && ||
  // Instructions (DO) Expressions (VALUE)

  //IF EXPRESSION
  var aVariable = 3
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)


  //loop

  // EVERY THING IN SCALA IS AN EXPRESSION!
  val aWeridValue = (aVariable = 4) // unit == void
  println(aWeridValue)

  // side effects: println(), whiles, reassigning -> expressions return unit

  //code blocks
  val aCodeBlock = {
    //value of bloc is the value of its last expression
    // variables only available inside
    val y = 2;
    val z = y+1
    if(z>2) "hello" else "goodbye"
  }

  // 1. diference between "hello world" vs println("hello world")
  // 2.

  val someValue = {
    2<3
  }

  val someOtherValue = {
    if (someValue) 239 else 985
    67
  }


}
