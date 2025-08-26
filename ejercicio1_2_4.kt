fun main(){
    val prod1= mapOf("Nombre" to "Laptop Gamer", "Precio" to 250.50,"Categoria" to "Tecnologia") 
    val prod2= mapOf("Nombre" to "Libro de Kotlin", "Precio" to 45.20,"Categoria" to "Libros") 

    val inventario= listOf(prod1,prod2)

    fun buscar(nombre:String, inventario:List<Map<String, Any>>){
        var encontrado= false
        for(producto in inventario){
            if(producto["Nombre"]==nombre){
                println(producto)
                encontrado=true
                break
            }
        }
        if(!encontrado){
            println(null)
        }
    }

    fun promedio(inventario: List<Map<String,Any>>){
        var suma=0.0 //sumando precio de los productos
        var cantidad=0 //contando los productos

        for(producto in inventario){ 
            val precio=producto["Precio"] as? Double ?:0.0 // si no es double o nulo usa 0.0
            suma+=precio // precio total
            cantidad++ //aumenta contador
        }
        
        val promedio= if(cantidad>0) suma/cantidad else 0.0// calcula promedio si hay productos
        println(promedio)

    }
    val categorias=inventario.filter{it["Categoria"]=="Libros"}
    println(categorias)

    val nombres = inventario.map{it["Nombre"]}

    println(nombres)
}