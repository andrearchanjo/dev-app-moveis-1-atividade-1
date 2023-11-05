import classes.AcaoPersonalizada
import helpers.lerOperador
import helpers.toOperacaoNumerica
import robos.MarcianoPremium

fun main() {
    val acaoUsuario = AcaoPersonalizada()
    val marciano = MarcianoPremium(acaoUsuario)

    println("Bem-vindo ao Robô Marciano! Digite 'FIM' para encerrar.")
    while (true) {
        print("Você: ")
        val comando = readLine() ?: ""
        if (comando == "FIM") {
            break
        } else {
            val operacaoNumerica = comando.toOperacaoNumerica()

            var a = 0.0
            var b = 0.0

            if (operacaoNumerica != null) {
                a = lerOperador(1)
                b = lerOperador(2)
            }

            marciano.responda(comando, a, b)
        }
    }
}
