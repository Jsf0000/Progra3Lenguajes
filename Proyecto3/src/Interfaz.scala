

class Interfaz {
  
  
    def ingresarMatrix(): Array[Array[Int]] = {
    var insertar = false
    var m = Array.ofDim[Int](3,3)
    while (insertar == false){  
    println("Ingrese matrix: "+"\n")
    for(i <- 0 to 2 ){
      for( j <- 0 to 2){
        println("Ingrese celda: ")
         m(i)(j) = readLine().toInt
      }
    }
     printMatrix(m)
     println("Matrix correcta:  (s/n)")
      var r = readLine()
      if (r == "s"){
        insertar = true
      }else{
        insertar = false
      }
    }
     return m
    
  }
  
    
 def escogerHeuristica(): Int ={
   var insertar = false
   var r = 0
   while (insertar == false){
   println("Escoga las siguientes opciones para heuristicas")
   println("1) Manhattan Distance")
   println("2) Tiles out of row and column")
   r = readLine().toInt
   if (r == 1 || r == 2){
      insertar = true
   }
   else{
      insertar = false
    }
   }  
    return r
   }
   

   
    
    
    
    
   def printMatrix(matrix: Array[Array[Int]]) = {
		println(matrix.map(_.mkString("|")).mkString("\n"))
   }
  
}