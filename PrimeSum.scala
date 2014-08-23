object PrimeSum {
	def isPrime(i:Int) : Boolean = {
        	if (i <= 1) false
        	else if (i == 2) true
        	else !(2 until i).exists(x => i % x == 0)
	}
	def sumofPrime(num:Int):Int ={
		  (1 to num).toList.filter(x=>isPrime(x)).sum
	}
	def main(args: Array[String]) = {
    		println(sumofPrime(10))
	}
}