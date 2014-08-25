object EvFibSum {
  def fib(num:Int):Int = {
    if(num==0) 0
    else if(num==1) 1
    else fib(num-1)+fib(num-2)
  }
  def FibSum(n:Int):Int = {
   	(0 to n).toList.map(x=>fib(x)).filter(x=>if(x%2==0) true else false).sum
  }
  def main(args:Array[String]):Unit = {
    println(FibSum(10))
  }
}