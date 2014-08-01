object Anagram{
 def ifAnagram(str1:String,str2:String):Boolean = {
 	if(str1.length!=str2.length) false
 	else str1.forall(str2.contains(_)) && str2.forall(str1.contains(_))
 }
 def main(args:String):Unit = {
 	println(ifAnagram("listen","silent"))
 }
}