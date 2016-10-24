


object Demo {
  val a = new Vorax
  val i = new Interfaz
  var numH = 0
  var salir = false
  
  
  def main(args: Array[String]){
  
    
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