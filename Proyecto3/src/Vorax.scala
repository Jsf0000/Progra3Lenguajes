

class Vorax {
  
  
 var raiz = new Nodo
  
 var hijosV : List[Array[Array[Int]]] = List()
 
 var matrixM = Array(Array(1,2,3),Array(4,5,6),Array(7,8,0))
 
 
  def printMatrix(matrix: Array[Array[Int]]) = {
    println("")
		println(matrix.map(_.mkString("|")).mkString("\n"))
	}
 
   def addListNodos( l1:List[Nodo],l2:List[Nodo]) : List[Nodo] ={
    var list =  l1 ++ l2
    return list
  }
 
  def addListMatrix(l1:List[Array[Array[Int]]],l2:List[Array[Array[Int]]] ): List[Array[Array[Int]]]={
    var list =  l1 ++ l2
    return list 
  }
   
 
 def caso1(m : Array[Array[Int]]) = {
   var m1 = Array.ofDim[Int](3,3)
   var m2 = Array.ofDim[Int](3,3)
   var list : List[Nodo] = List(new Nodo)
   m1 = m.map(_.clone())
   if (m(0)(0) == 0){
     m1(0)(0) = m1(0)(1)
     m1(0)(1) = 0
     //raiz.hijos(0) = new Nodo
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(0)(0) = m1(1)(0)
     m1(1)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
     //raiz.hijos(1) = new Nodo
     //raiz.hijos(1).matrix = m1
   }else if(m(0)(2) == 0){
     m1 = m.map(_.clone())
     m1(0)(2) = m1(0)(1)
     m1(0)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(0)(2) = m1(1)(2)
     m1(1)(2) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
   }else if(m(2)(0)== 0){
     m1 = m.map(_.clone())
     m1(2)(0) = m1(1)(0)
     m1(1)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(2)(0) = m1(2)(1)
     m1(2)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
   } else if(m(2)(2) == 0){
     m1 = m.map(_.clone())
     m1(2)(2) = m1(2)(1)
     m1(2)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(2)(2) = m1(1)(2)
     m1(1)(2) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
   }
 }
   
   def caso2(m : Array[Array[Int]]){
    var m1 = Array.ofDim[Int](3,3)
    if(m(1)(0)== 0){
     m1 = m.map(_.clone())
     m1(1)(0) = m1(0)(0)
     m1(0)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(1)(0) = m1(2)(0)
     m1(2)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
     m1 = m.map(_.clone())
     m1(1)(0) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(2).matrix = m1
   } else if(m(0)(1) == 0){
     m1 = m.map(_.clone())
     m1(0)(1) = m1(0)(0)
     m1(0)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(0)(1) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
     m1 = m.map(_.clone())
     m1(0)(1) = m1(0)(2)
     m1(0)(2) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(2).matrix = m1
   }
     else if(m(1)(2) == 0){
     m1 = m.map(_.clone())
     m1(1)(2) = m1(0)(2)
     m1(0)(2) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(1)(2) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
     m1 = m.map(_.clone())
     m1(1)(2) = m1(2)(2)
     m1(2)(2) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(2).matrix = m1
   }
     else if(m(2)(1) == 0){
     m1 = m.map(_.clone())
     m1(2)(1) = m1(2)(0)
     m1(2)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(2)(1) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
     m1 = m.map(_.clone())
     m1(2)(1) = m1(2)(2)
     m1(2)(2) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(2).matrix = m1
   } 
   }
   
   def caso3(m : Array[Array[Int]]){
     var m1 = Array.ofDim[Int](3,3)
     if(m(1)(1)== 0){
     m1 = m.map(_.clone())
     m1(1)(1) = m1(1)(0)
     m1(1)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(1)(1) = m1(0)(1)
     m1(0)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
     m1 = m.map(_.clone())
     m1(1)(1) = m1(1)(2)
     m1(1)(2) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(2).matrix = m1
     m1 = m.map(_.clone())
     m1(1)(1) = m1(2)(1)
     m1(2)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(3).matrix = m1
   }
   
   
 }
   
   
   def getCordinates( tile : Int , Gp_state: Array[Array[Int]] ) = {

		var rowTile : Int = 0

		var colTile : Int = 0 
		
		for( row <- 0 to 2) {
	  	
	  		for( col <- 0 to 2) {

	  			if ( tile == Gp_state(row)(col) ){

	  				rowTile = row

	  				colTile = col

	  			}

	  		}
	  	
	  	}
		
		(rowTile,colTile)
	}
   
   
  	def tilesOutRowColHeuristic(S_state: Array[Array[Int]], Gp_state: Array[Array[Int]]) : Int = {
		var S_tile : Int = 0

		var Gp_tile : Int = 0

		var outOfRow : Int = 0

		var outOfCol : Int = 0

		for( row <- 0 to 2) {
	  	
	  		for( col <- 0 to 2) {

	  			S_tile = S_state(row)(col)

	  			var ( goalRow, goalCol ) = getCordinates(S_tile, Gp_state)

	  			if (row != goalRow)
	  				outOfRow += 1

	  			if (col != goalCol)
	  				outOfCol += 1	
	  		

	  		}
	  	}

	  	var sum = outOfRow + outOfCol

	  	sum

	};
   
     def min (l1: List[Nodo]): Nodo ={
       var minN: Int = 0
       var  minA = Array(0,0)
       minA(0) = tilesOutRowColHeuristic(l1(0).matrix,matrixM)
         //printMatrix(l1(0).matrix)
         //println(minA(0))
       for(i <- 1 to (l1.size -1)){
         minN = tilesOutRowColHeuristic(l1(i).matrix,matrixM)
         //printMatrix(l1(i).matrix)
         //println(minN)
         if (minN < minA(0)){
           minA(0) = minN
           minA(1) = i
         }
       }
       return l1(minA(1))
     }
     
    def bucle(){
      var meta: Boolean = false
      hijosV = addListMatrix(hijosV, List(raiz.matrix))
      var cont = 0
      while (meta == false){
        cont = cont +1
        if (raiz.matrix.deep == matrixM.deep){
          printMatrix(raiz.matrix)
          meta = true
        }
        else{
          caso1(raiz.matrix)
          caso2(raiz.matrix)
          caso3(raiz.matrix)
          printMatrix(raiz.matrix)
          println("Paso: " +cont)
          buscarHijos()
          raiz = min(raiz.hijos)
          hijosV = addListMatrix(hijosV, List(raiz.matrix))
        }
      }     
    }
     
    def existe(m : Array[Array[Int]]): Boolean = {
      for(i <- 0 to (hijosV.size - 1)){
         if (m.deep == hijosV(i).deep ){
           return true
         }
      }
      return false
    }

     def buscarHijos(){
       var cont = 0
       while(cont < raiz.hijos.size)
       {
         if (existe(raiz.hijos(cont).matrix)){
             raiz.hijos = raiz.hijos.patch(cont,Nil,1)
             cont = 0
       }
       cont = cont + 1
      } 
     }
     
 
 
 
 
 
 
 

 
  
  
}