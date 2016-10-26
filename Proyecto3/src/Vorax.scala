import Math.abs


class Vorax {
  
 // raiz del algoritmo voraz
 var raiz = new Nodo
  
 // listas que almacenan las matrices correspondientes a visitados, libres y padres
 var hijosV : List[Array[Array[Int]]] = List()
 var padres : List[Array[Array[Int]]] = List()
 var hijosVN :  List[Nodo] = List()
 
 //matriz meta para la solucion
 var matrixM = Array(Array(1,2,3),Array(4,5,6),Array(7,8,0))
 
 // metodo que imprime una matriz
  def printMatrix(matrix: Array[Array[Int]]) = {
    println("")
		println(matrix.map(_.mkString("|")).mkString("\n"))
	}
 //metodos para concatenar una lista de nodos y lista de matrices
   def addListNodos( l1:List[Nodo],l2:List[Nodo]) : List[Nodo] ={
    var list =  l1 ++ l2
    return list
  }
 
  def addListMatrix(l1:List[Array[Array[Int]]],l2:List[Array[Array[Int]]] ): List[Array[Array[Int]]]={
    var list =  l1 ++ l2
    return list 
  }
   
 // se presentan 3 casos los cuales corresponden a formar los movimientos posibles segun la ubicacion del cero en la matriz
 def caso1(m : Array[Array[Int]]) = {
   var m1 = Array.ofDim[Int](3,3)
   var m2 = Array.ofDim[Int](3,3)
   var list : List[Nodo] = List(new Nodo)
   m1 = m.map(_.clone())
   if (m(0)(0) == 0){
     m1(0)(0) = m1(0)(1)
     m1(0)(1) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(0).matrix = m1
     m1 = m.map(_.clone())
     m1(0)(0) = m1(1)(0)
     m1(1)(0) = 0
     raiz.hijos = addListNodos(raiz.hijos,List(new Nodo))
     raiz.hijos(1).matrix = m1
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
   
   //Metodo utilizado  por la heuristica  Tiles out of row and column
   
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
   
    // implementacion de la primera heuristica
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
	
	
    //funcion que obtiene el minimo valor de la heuristica pasada correspondiente a los hijos   
     def min (l1: List[Nodo],callback:(Array[Array[Int]],Array[Array[Int]])  => Int): Nodo ={
       var minN: Int = 0
       var  minA = Array(0,0)
       minA(0) = callback(l1(0).matrix,matrixM)
       for(i <- 1 to (l1.size -1)){
         minN = callback(l1(i).matrix,matrixM)
         if (minN < minA(0)){
           minA(0) = minN
           minA(1) = i
         }
       }
       return l1(minA(1))
     }
     
     
     //funcion que realiza el algoritmo voraz
    def bucle(callback:(Array[Array[Int]],Array[Array[Int]])  => Int){
      var meta: Boolean = false
      hijosV = addListMatrix(hijosV, List(raiz.matrix))
      var cont = 0
      while (meta == false){
        cont = cont +1
        if (raiz.matrix.deep == matrixM.deep || cont == 2000){
          if(cont == 2000){
            println("Existe desbordamiento")
          }
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
          hijosVN = addListNodos(hijosVN,List(raiz))
          raiz = min(raiz.hijos,callback)
          hijosV = addListMatrix(hijosV, List(raiz.matrix))
          if(existe(raiz.matrix,padres) == false){
            padres = addListMatrix(hijosV, List(raiz.matrix))
          }
          
        }
      }     
    }
    
    
    //segunda heuristica implementada
   def manhattanDistanceHeuristic(S_state: Array[Array[Int]], Gp_state: Array[Array[Int]]) : Int = {

		var S_tile : Int = 0

		var Hm_Si_result : Int = 0

		for( row <- 0 to 3-1) {
	  	
	  		for( col <- 0 to 3-1) {

	  			S_tile = S_state(row)(col)

	  			var ( goalRow, goalCol ) = getCordinates(S_tile, Gp_state)	
	  		
	  			Hm_Si_result += abs(row - goalRow) + abs(col - goalCol) 

	  		}
	  	}

	  	Hm_Si_result += 1

	  	Hm_Si_result
		
	}
         
   //funcion para verificar si una matriz existe en una determinada lista de matrices
    def existe(m : Array[Array[Int]], l: List[Array[Array[Int]]]): Boolean = {
      for(i <- 0 to (l.size - 1)){
         if (m.deep == l(i).deep ){
           return true
         }
      }
      return false
    }

    // funcion que elimina hijos que se encuentren en la lista de hijosV
     def buscarHijos(){
       var cont = 0
       while(cont < raiz.hijos.size)
       {  
         if (existe(raiz.hijos(cont).matrix,hijosV)){
            
             raiz.hijos = raiz.hijos.patch(cont,Nil,1)
             cont = 0
             
             if (raiz.hijos.size == 0) {
               raiz.matrix = padres.last.map(_.clone())
               padres = padres.patch((padres.size -1),Nil,1)
               printMatrix(raiz.matrix)
               caso1(raiz.matrix)
               caso2(raiz.matrix)
               caso3(raiz.matrix)
               buscarHijos()              
             }
         }
         else
         {
           cont = cont + 1
         }
      } 
     }
     
 
 

 
 
 

 
  
  
}