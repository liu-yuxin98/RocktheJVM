package lectures.part1basic

object StringOps extends App{

  val str:String = "hello, I'm james"
  println(str.charAt(2))
  println(str.substring(0,2))
  println(str.split(",").toList)
  println(str.startsWith("hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)
  val aNumber = "45".toInt
  println(aNumber)
  println('a' +:"hello":+'z')
  println('a'+"hello"+'z')
  println(str.reverse)
  println(str.take(2))

  // s-
  val name ="david"
  val age = 12
  val greeting = s"$name ${age+2}"
  println(greeting)

  // f-
  val speed = 1.2f
  val myth = f"$name can eat $speed%3.3f"
  println(myth)

  // raw  leave it same
  println(raw"this is a \n new line")
  println("this is a \n new line")


}
