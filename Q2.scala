object Q2{

def sign(n:Int):Unit=n match{
case n if n < 0 => println("It is an Negative Number")
case n if n == 0 => println("It is Zero")
case n if n%2 ==0 => println("It is an Even Number")
case n if n%2 !=0 => println("It is an Odd Number")
}

def main(args:Array[String]):Unit={
print("Enter a number: ")
var nm = scala.io.StdIn.readInt()
sign(nm)
}
}