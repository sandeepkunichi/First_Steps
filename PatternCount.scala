import scala.io.Source
object PattrenMatch {
	def LookFor(pattern:String,file:String):Int = {
		val temp = Source.fromFile(file)
		temp.getLines().flatMap(_.split(" ")).toList.count(x=>x.toLowerCase().contains(pattern))
	}
 	def main(args:Array[String]): Unit = {
		println(LookFor("pattern","file.txt")) /* Where pattern is the pattern to be found and file.txt is the file to be searched */
	}
}