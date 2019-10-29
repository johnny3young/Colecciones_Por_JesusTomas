package com.young.colecciones_por_jesustomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listaString: List<String> = listOf(
            "uno",
            "dos",
            "tres",
            "cuarto",
            "cinco",
            "seis",
            "siete",
            "Uno",
            "Dos",
            "Tres",
            "Cuatro",
            "Cinco",
            "Seis",
            "Siete",
            "UNO",
            "DOS",
            "TRES",
            "CUATRO",
            "CINCO",
            "SEIS",
            "SIETE"
        )
        println(listaString.last())
        println(listaString.last{it.length ==3})
        println(listaString.count())
        println(listaString.count { it.length ==3 })
        val conjunto: Set<Int> = setOf(3,6,5,5,5,3)
        println(conjunto.last())
        println(listaString.sorted())
        listaString.forEach {
            println(it)
        }

        val map: Map<Int, String> = mapOf(1 to "uno", 2 to "dos", 3 to "tres")
        if (map.all { it.key < 5 }) println("Todas las claves < 5")
        if (map.any { it.value == "dos" }) println("Un valor es 'dos")

        for ((key,value) in map)
            println("El $key corresponde a $value")
        
        map.forEach {
            println(it)
        }

    }

}

