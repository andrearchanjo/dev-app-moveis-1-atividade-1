import robos.Marciano

fun main() {
    val marciano = Marciano()

    println("Bem-vindo ao Robô Marciano! Digite 'FIM' para encerrar.")
    while (true) {
        print("Você: ")
        val comando = readLine() ?: ""
        if (comando == "FIM") {
            break
        }
        marciano.responda(comando)
    }
}