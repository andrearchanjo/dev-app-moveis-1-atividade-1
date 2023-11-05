package classes

import interfaces.AcaoUsuario
import java.io.IOException

class AcaoPersonalizada : AcaoUsuario {
    override fun realizarAcao() {
        var count = 5
        while (count >= 0) {
            println("$count")
            count--
            Thread.sleep(1000)
        }

        println("-- Redirecionado para uma página web --")

        try {
            val url = "https://www.google.com.br/?hl=pt-BR"
            val os = System.getProperty("os.name").lowercase()
            val processBuilder = ProcessBuilder()

            if (os.contains("win")) {
                processBuilder.command("cmd", "/c", "start", url)
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                processBuilder.command("xdg-open", url)
            }

            processBuilder.start()
        } catch (e: IOException) {
            println("Ocorreu um erro ao abrir a página: ${e.message}")
        }
    }
}