import robos.MarcianoAvancado
import helpers.lerOperador
import helpers.toOperacaoNumerica

fun main() {
    val marciano = MarcianoAvancado()

    println("Bem-vindo ao Robô Marciano! Digite 'FIM' para encerrar.")
    while (true) {
        print("Você: ")
        val comando = readLine() ?: ""
        if (comando == "FIM") {
            break
        } else {
            val operacaoNumerica = comando.toOperacaoNumerica()

            if (operacaoNumerica != null) {
                val a = lerOperador(1)
                val b = lerOperador(2)

                marciano.responda(comando, a, b)
            } else {
                marciano.responda(comando)
            }
        }
    }
}
