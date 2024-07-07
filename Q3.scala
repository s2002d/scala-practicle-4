object Q3{

def upper(name:String):Unit={
println(name.toUpperCase)

}

def lower(name:String):Unit={
println(name.toLowerCase)
}

def format(name:String , x:Int , y:Int):Unit={
val mstring = name.updated(x,name(x).toUpper).updated(y,name(y).toUpper)
println(mstring)
}

def main(args:Array[String]):Unit={
val nlist = Array("Benny", "Niroshan", "Saman", "Kumara")
upper(nlist(0))
format(nlist(1),0,1)
lower(nlist(2))
format(nlist(3),0,5)
}








}