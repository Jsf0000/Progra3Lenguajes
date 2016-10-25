


object Demo {
  val a = new Vorax
  val i = new Interfaz
  var numH = 0
  var salir = false
  
  
  def main(args: Array[String]){
  
    // para llamarlo sin menu 
   // a.raiz.matrix = Array(Array(7,3,2),Array(1,4,5),Array(6,8,0))
   
     //a.raiz.matrix = Array(Array(1,8,2),Array(0,4,3),Array(7,6,5))
   // i.invCount(Array(Array(7,3,2),Array(1,4,5),Array(6,8,0)))
    //a.bucle(a.manhattanDistanceHeuristic)
    
   while(salir == false){
   a.raiz.matrix = i.ingresarMatrix()
   numH = i.escogerHeuristica()
   if (numH == 1){
     a.bucle(a.manhattanDistanceHeuristic)
   }
   else{
     a.bucle(a.tilesOutRowColHeuristic)
   }
    println("Salir (s/n)")   
    var s = readLine()
   
    if (s == "s"){
      salir == true
    }
    else {
      salir = false
    }
   }
  }
  
   
}
