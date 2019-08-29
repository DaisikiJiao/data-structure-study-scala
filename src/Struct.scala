/**
  * Created by luox on 2018/7/3.
  */
class Struct {

  val array=new Array[String](5)
  private var front:Int=0
  private var rear:Int=0

  /**
    * 初始化队列
    */
  def initQueue(): Unit ={
    this.front=0
    this.rear=0
  }

  /**
    * 当前队列长度
    * @return
    */
  def queueLength(): Int ={
    (rear-front+array.length)%array.length
  }

  /**
    * 入队
    * @param queueElement
    * @return
    */
  def enQueue(queueElement:String): Array[String] ={
    if((rear+1)%array.length==front)
      throw new Exception
    array(rear)=queueElement
    rear=(rear+1)%array.length
    this.array
  }

  /**
    * 出队
    */
  def deQueue(): Array[String] ={
    if(front==rear)
      throw new Exception
    array(front)=null
    front=(front+1)%array.length
    this.array
  }

}
