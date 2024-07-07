object Q1{

var iname:Array[String] = Array("Chair","Table","Book")
var iqunti:Array[Int] = Array(12,6,36)


def display():Unit={
println("Inventory: ")
var i=0
while(i < iname.length){
print(iname(i))
print(" = ")
println(iqunti(i))
i=i+1
}
}

def restock(name:String , qun:Int):Unit={
val num = iname.indexOf(name)
println("Restock Item:")
if(num >= 0){
iqunti(num) += qun
display()
}
else{
println("Item doesn't exit..")
}
}

def sell(name:String , qun:Int):Unit={
val num = iname.indexOf(name)
println("After sell Item:")
if(num >=0){
if(iqunti(num) >= qun){
iqunti(num) -= qun
display()
}
else{println("Stock is not enough to sell.")}
}
else{println("Item doesn't exit..")}
}


def main(args:Array[String]):Unit={
display()
restock("Book",4)
sell("Chair",18)
}





}