/**
  * Created by luox on 2018/7/3.
  */
object StructTest {

  def main(args: Array[String]): Unit = {
    val struct: Struct = new Struct
    struct.initQueue()
    for (n<-0 to 3){
      struct.enQueue(n.toString)
      for(i<-0 to (struct.array.length-1)){
       printf(struct.array(i)+"*")
      }
      println()
    }
    for (n <- 0 to 3){
      struct.deQueue()
      for(i<-0 to (struct.array.length-1)){
        printf(struct.array(i)+"*")
      }
      println()
    }

  }

}
