package robos

import interfaces.AcaoUsuario

class MarcianoPremium(private val acaoUsuario: AcaoUsuario) : MarcianoAvancado() {
    override fun responda(frase: String, a: Double, b: Double) {
        if (frase.contains("agir")) {
            println("É pra já!")
        } else {
            super.responda(frase)
        }
    }
}