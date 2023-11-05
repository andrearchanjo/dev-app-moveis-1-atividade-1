package robos

open class Marciano {
    open fun responda(frase: String) {
        if (frase.isEmpty()) {
            println("Não me incomode")
        } else if (frase.uppercase().contains("EU")) {
            println("A responsabilidade é sua")
        } else {
            val palavras: List<String> = frase.split(" ")
            var isGrito: Boolean = false;

            palavras.forEach {
                palavra->if (palavra == palavra.uppercase()) {
                    isGrito = true
                }
            }

            if (frase.endsWith("?")) {
                if (isGrito) {
                    println("Relaxa, eu sei o que estou fazendo!")
                } else {
                    println("Certamente")
                }
            } else {
                if (isGrito) {
                    println("Opa! Calma aí!")
                } else {
                    println("Tudo bem, como quiser")
                }
            }
        }
    }
}