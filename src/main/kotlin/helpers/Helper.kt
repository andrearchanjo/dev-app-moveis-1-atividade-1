package helpers

import enums.OperacaoNumerica

fun lerOperador(numOperador: Int): Double {
    print("Operador $numOperador: ")
    val operador = readLine() ?: ""
    return operador.toDoubleOrNull() ?: 0.0
}

fun String.toOperacaoNumerica(): OperacaoNumerica? {
    return when (this.lowercase()) {
        "some" -> OperacaoNumerica.SOMA
        "subtraia" -> OperacaoNumerica.SUBTRACAO
        "multiplique" -> OperacaoNumerica.MULTIPLICACAO
        "divida" -> OperacaoNumerica.DIVISAO
        else -> null
    }
}

fun contador(from: Int, onComplete: () -> Unit) {
    var count = from
    while (count >= 0) {
        println("Contador: $count")
        count--
        Thread.sleep(1000)
    }

    onComplete()
}
