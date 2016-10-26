

class Interfaz {
  
     // arreglo utilizado para ver si una matriz tiene solucion
     var solve:Array[Int] =  new Array[Int](9)
  
     // Metodo  que permite ingresar la matriz desde consola
    def ingresarMatrix(): Array[Array[Int]] = {
    var insertar = false
    var m = Array.ofDim[Int](3,3)
    var cont = 0
    while (insertar == false){  
    println("Ingrese matrix: "+"\n")
    for(i <- 0 to 2 ){
      for( j <- 0 to 2){
        println("Ingrese celda: ")
         m(i)(j) = readLine().toInt
         solve(cont) = m(i)(j)
         cont +=1
      }
    }
    printMatrix(m)
    if (isSolvable() == false){
      println("Problema sin solucion")
      insertar = false
      cont = 0
    }else{
     println("Matrix correcta:  (s/n)")
      var r = readLine()
      if (r == "s"){
        insertar = true
      }else{
        insertar = false
        cont = 0
      }
     
      }
    }
     return m
    
  }
  
    
// Metodo que permite escoger la heutistica desde consola 
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
   


   // Metodo que devuelve el contador invertido para saber si una matriz tiene solucion
   def invCount():Int = {
    var invCount = 0
   
    for(i <- 0 to 8 )
    {
      for (j <- (i+1) to 8)
      {
        if(solve(j) > solve(i)){
          invCount +=1 
       }
      }
     }
    return invCount
   }
 
   
   // Metodo que devuelve un true si una tiene solucion
   def isSolvable(): Boolean ={
     var inv = invCount()
     if (inv%2 == 0){
       return true
     }else{
       return false
     }
   }
   // Metodo para imprimir una matriz
   def printMatrix(matrix: Array[Array[Int]]) = {
		println(matrix.map(_.mkString("|")).mkString("\n"))
   }
  
}