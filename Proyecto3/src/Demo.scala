


object Demo {
  //Objetos de clases
  val a = new Vorax
  val i = new Interfaz

  var numH = 0
  var salir = false
  
  
  def main(args: Array[String]){
  

    
   while(salir == false){
   // se define la matriz que va a ingresar  
   a.raiz.matrix = i.ingresarMatrix()
   numH = i.escogerHeuristica()
   
   // se escoge la heuristica
   if (numH == 1){
     a.bucle(a.manhattanDistanceHeuristic)
   }
   else{
     a.bucle(a.tilesOutRowColHeuristic)
   }
// condicion de salida   
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
