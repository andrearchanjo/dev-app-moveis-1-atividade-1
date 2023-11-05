package robos

import enums.toOperacaoNumerica

class MarcianoAvancado : Marciano() {
    fun responda(frase: String, a: Double, b: Double) {
        val operacaoNumerica = frase.toOperacaoNumerica()
        if (operacaoNumerica != null) {
            val valor = operacaoNumerica.calcular(a, b)

            if (valor.isInfinite()) {
                println("Não é possível dividir por zero!")
            } else {
                println("Essa eu sei, o resultado é $valor")
            }
        } else {
            super.responda(frase)
        }
    }
}
