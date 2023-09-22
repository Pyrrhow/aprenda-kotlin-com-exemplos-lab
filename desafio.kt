// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (val nome: String, val id: Int) 

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario("Algusto", 1)
    val usuario2 = Usuario("Bernado", 2)
    val usuario3 = Usuario("Catarina", 3)
    val usuario4 = Usuario("Diogo", 4)
    val usuario5 = Usuario("Eliz", 5)
    
    val ce1 = ConteudoEducacional("conteudo educacional 1")
    val ce2 = ConteudoEducacional("conteudo educacional 2")
    
    val ceList: List<ConteudoEducacional> = mutableListOf(ce1,ce2)
    
    val kotlin = Formacao("Kotlin",ceList)
    
    kotlin.matricular(usuario1)
    kotlin.matricular(usuario2)
    kotlin.matricular(usuario5)
    
    println(kotlin.inscritos);
}
