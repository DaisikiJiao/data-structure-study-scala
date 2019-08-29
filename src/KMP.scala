import scala.io.StdIn

/**
  * Created by luox on 2018/7/4.
  */
object KMP {

  def main(args: Array[String]): Unit = {
    printf("matchString:")
    val matchString:Array[Char]= StdIn.readLine().toCharArray
    printf("inputString:")
    val inputString:Array[Char]= StdIn.readLine().toCharArray

    findByKMP(matchString,inputString)

    def findByKMP(matchArray:Array[Char],inputArray:Array[Char]): Unit ={

      var i:Int=0
      var j:Int=0

      val next:Array[Int]=getNext(inputArray)

      while (i<matchArray.length&&j<inputArray.length) {

        if((j==(-1))||matchArray(i)==inputArray(j)){
          i+=1
          j+=1
        }else{
          j=next(j)
        }
      }

      if(j>0) {
        println("find in:"+(i-1))
      }else{
        println("not find.")
      }
    }

    def getNext(inputArray:Array[Char]): Array[Int] ={
      var i:Int=0
      var j:Int=(-1)

      var next:Array[Int]=new Array[Int](inputArray.length+1)
      next(0)=(-1)

      while (i<inputArray.length) {
        if((j==(-1))||inputArray(i)==inputArray(j)){
          i+=1
          j+=1
          next(i)=j
        }else{
          j=next(j)
        }
      }
      next
    }


  }

}
