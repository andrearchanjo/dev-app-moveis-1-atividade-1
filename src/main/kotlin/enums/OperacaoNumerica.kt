package enums

enum class OperacaoNumerica {
    SOMA {
        override fun calcular(a: Double, b: Double): Double {
            return a + b
        }
    },
    SUBTRACAO {
        override fun calcular(a: Double, b: Double): Double {
            return a - b
        }
    },
    MULTIPLICACAO {
        override fun calcular(a: Double, b: Double): Double {
            return a * b
        }
    },
    DIVISAO {
        override fun calcular(a: Double, b: Double): Double {
            if (b != 0.0) {
                return a / b
            } else {
                return Double.POSITIVE_INFINITY
            }
        }
    };

    abstract fun calcular(a: Double, b: Double): Double
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