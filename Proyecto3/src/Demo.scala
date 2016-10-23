


object Demo {
  val a = new Vorax
  
 def printMatrix(matrix: Array[Array[Int]]) = {
		println(matrix.map(_.mkString("|")).mkString("\n"))
	}
  
  def remove(num: Int, list: List[Int]) = list diff List(num)
  
  
  def addList( l1:List[Int],l2:List[Int]) : List[Int] ={
    var list =  l1 ++ l2
    return list
  }

  
  def main(args: Array[String]){
  
   var list1 = List(4,5,6)
   var list2 = List(1)
   
   

   
   
   var matrix1 = Array(Array(0,1,8),Array(3,5,6),Array(4,2,7))
   
   
  // oncePerSecond(imprimirHola)
   
   
  // print(list1.size)
   //list1 = list1.patch(1,Nil,1)
   //print(list1.size)
   
   //var matrix2 = Array(Array(0,2,3),Array(8,1,4),Array(7,6,5)) 
   
  // var listM = List(matrix1)
   //var matrix1 = Array(Array(8,2,3),Array(1,6,4),Array(7,5,0))
   //print(listM.contains(matrix2.deep))
   //var matrixM = Array(Array(1,2,3),Array(1,6,4),Array(7,5,0))
   
   a.raiz.matrix = matrix1
   
   //a.caso1(matrix1)
   //a.caso2(matrix1)
   //a.caso3(matrix1)
   //printMatrix(a.min(a.raiz.hijos).matrix)
 // printMatrix(a.raiz.hijos(1).matrix)
   //print(a.raiz.hijos.size)
  
   a.bucle()
   
   //print(a.tilesOutRowColHeuristic(matrix1,matrixM))
     
    
    
    
  }
}