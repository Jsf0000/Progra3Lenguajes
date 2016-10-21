


object Demo {
  val a = new Vorax
  
 def printMatrix(matrix: Array[Array[Int]]) = {
		println(matrix.map(_.mkString("|")).mkString("\n"))
	}
  
  def addList( l1:List[Int],l2:List[Int]) : List[Int] ={
    var list =  l1 ++ l2
    return list
  }
  
  def main(args: Array[String]){
  
   val list1 = List(4,5,6)
   val list2 = List(1)
   
   
   var matrix1 = Array(Array(0,2,3),Array(8,1,4),Array(7,6,5))
   var matrixM = Array(Array(1,2,3),Array(4,5,6),Array(7,8,0))
   val str = a.raiz.matrix
   
   a.caso1(matrix1)
  //printMatrix(a.raiz.hijos1(1).matrix)
  // print(a.raiz.hijos1.size)
   
   
   print(a.tilesOutRowColHeuristic(matrix1,matrixM))
     
    
    
    
  }
}