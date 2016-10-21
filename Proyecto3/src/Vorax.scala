

class Vorax {
  
  
 var raiz = new Nodo
 
 var matrixM = Array(Array(1,2,3),Array(4,5,6),Array(7,8,0))
 raiz.matrix = Array(Array(0,0,0),Array(0,0,0),Array(0,0,0))
 
 
   def addListNodos( l1:List[Nodo],l2:List[Nodo]) : List[Nodo] ={
    var list =  l1 ++ l2
    return list
  }
 
 
 def caso1(m : Array[Array[Int]]) = {
   var m1 = Array.ofDim[Int](3,3)
   var list : List[Nodo] = List(new Nodo)
   m1 = m
   if (m(0)(0) == 0){
     m1(0)(0) = m1(0)(1)
     m1(0)(1) = 0
     //raiz.hijos(0) = new Nodo
     raiz.hijos1 = addListNodos(raiz.hijos1,list)
     raiz.hijos1(0).matrix = m1
     m1 = m
     m1(0)(0) = m1(1)(0)
     m1(1)(0) = 0
     raiz.hijos1 = addListNodos(raiz.hijos1,list)
     raiz.hijos1(1).matrix = m1
     //raiz.hijos(1) = new Nodo
     //raiz.hijos(1).matrix = m1
   }else if(m(0)(2) == 0){
     m1 = m
     m1(0)(2) = m1(0)(1)
     m1(0)(1) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(0)(2) = m1(1)(2)
     m1(1)(2) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
   }else if(m(2)(0)== 0){
     m1 = m
     m1(2)(0) = m1(1)(0)
     m1(1)(0) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(2)(0) = m1(2)(1)
     m1(2)(1) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
   } else if(m(2)(2) == 0){
     m1 = m
     m1(2)(2) = m1(2)(1)
     m1(2)(1) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(2)(2) = m1(1)(2)
     m1(1)(2) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
   }
 }
   
   def caso2(m : Array[Array[Int]]){
    var m1 = Array.ofDim[Int](3,3)
    if(m(1)(0)== 0){
     m1 = m
     m1(1)(0) = m1(0)(0)
     m1(0)(0) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(1)(0) = m1(2)(0)
     m1(2)(0) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
     m1 = m
     m1(1)(0) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos(2) = new Nodo
     raiz.hijos(2).matrix = m1
   } else if(m(0)(1) == 0){
     m1 = m
     m1(0)(1) = m1(0)(0)
     m1(0)(0) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(0)(1) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
     m1 = m
     m1(0)(1) = m1(0)(2)
     m1(0)(2) = 0
     raiz.hijos(2) = new Nodo
     raiz.hijos(2).matrix = m1
   }
     else if(m(1)(2) == 0){
     m1 = m
     m1(1)(2) = m1(0)(2)
     m1(0)(2) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(1)(2) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
     m1 = m
     m1(1)(2) = m1(2)(2)
     m1(2)(2) = 0
     raiz.hijos(2) = new Nodo
     raiz.hijos(2).matrix = m1
   }
     else if(m(2)(1) == 0){
     m1 = m
     m1(2)(1) = m1(2)(0)
     m1(2)(0) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(2)(1) = m1(1)(1)
     m1(1)(1) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
     m1 = m
     m1(2)(1) = m1(2)(2)
     m1(2)(2) = 0
     raiz.hijos(2) = new Nodo
     raiz.hijos(2).matrix = m1
   } 
   }
   
   def caso3(m : Array[Array[Int]]){
     var m1 = Array.ofDim[Int](3,3)
     if(m(1)(1)== 0){
     m1 = m
     m1(1)(1) = m1(1)(0)
     m1(1)(0) = 0
     raiz.hijos(0) = new Nodo
     raiz.hijos(0).matrix = m1
     m1 = m
     m1(1)(1) = m1(0)(1)
     m1(0)(1) = 0
     raiz.hijos(1) = new Nodo
     raiz.hijos(1).matrix = m1
     m1 = m
     m1(1)(1) = m1(1)(2)
     m1(1)(2) = 0
     raiz.hijos(2) = new Nodo
     raiz.hijos(2).matrix = m1
     m1 = m
     m1(1)(1) = m1(2)(1)
     m1(2)(1) = 0
     raiz.hijos(3) = new Nodo
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
   
   
 
 
 
 
 
 
 

 
  
  
}