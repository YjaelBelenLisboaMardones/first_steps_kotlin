
fun main(){
    //variable INT
    val x: Int= 5;
    println(x);
    //variable DOUBLE
    val y: Double= 6.3;
    println(y);
    
    println("La suma entre 5 y 6.3 es : "+ (y+x));
    println("La resta entre 5 y 6.3 es : "+ (y-x));
    println("La multiplicación entre 5 y 6.3 es : "+ (y*x));
    println("La división entre 5 y 6.3 es : "+ (y/x));
    
    var a: String?= "Hola"
    a= null
    val lengthSafe= a?.length
    println(lengthSafe)

    //var lengthForced=a!!.length
    //Para evitar el NullPointerException realizaría una verificación con un If
    
    var z: Int=2
    fun describe(obj:Any):String=
    	when(obj){
            z-> "dos"
            3-> "Miércoles"
            4-> "Jueves"
            5-> "Viernes"
            6 -> "Sábado"
			7 -> "Domingo"
            else-> "hola"
        }
        
        //Kotlin fue diseñado para dispositivos Android, por lo que su lenguaje es más actualizado y mejor, ya que 
        //fue creado pensando en lo que le faltaba a Java, es decir, es más preciso y descriptivo
        
        //La seguridad ante nulos y la función when permite que los códigos sean más estables y menos propenso a errores 
}