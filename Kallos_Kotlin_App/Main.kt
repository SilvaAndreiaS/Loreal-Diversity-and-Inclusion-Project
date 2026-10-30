
fun main() {

    // TELA 1 — INICIAL
    println("==============================================")
    println("       KALLOS KAI POIKILLIA")
    println("          BRANDSTORM L'ORÉAL")
    println("==============================================")

    println("Bem-vindo à plataforma!")
    println("Beleza, diversidade e inclusão.")

    // Menu principal
    while (true) {

        println("\n========== MENU PRINCIPAL ==========")
        println("1 - Acessibilidade e Inclusão")
        println("2 - Embalagens Ergonômicas e Braille")
        println("3 - Tecnologia de Leitura por Voz")
        println("4 - QR Code")
        println("5 - Perfil e Preferências")
        println("0 - Sair")

        print("\nEscolha uma opção: ")

        when (readLine()?.trim()) {

            // TELA 2 — ACESSIBILIDADE
            "1" -> telaAcessibilidade()

            // TELA 3 — EMBALAGENS
            "2" -> telaEmbalagens()

            // TELA 4 — LEITURA POR VOZ
            "3" -> telaLeituraVoz()

            // TELA 5 — QR CODE
            "4" -> telaQRCode()

            // TELA 6 — PERFIL
            "5" -> telaPerfil()

            // ENCERRAR
            "0" -> {
                println("Obrigada por conhecer nosso projeto!")
                break
            }

            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

// TELA 2 — ACESSIBILIDADE E INCLUSÃO
fun telaAcessibilidade() {
    println("\n===== ACESSIBILIDADE E INCLUSÃO =====")
    println("Nosso objetivo é tornar a beleza acessível.")
    println("- Experiência inclusiva")
    println("- Navegação acessível")
    println("- Informações claras")
    println("- Design pensado para diferentes usuários")
}

// TELA 3 — EMBALAGENS
fun telaEmbalagens() {
    println("\n===== EMBALAGENS INCLUSIVAS =====")
    println("- Embalagens ergonômicas")
    println("- Identificação em Braille")
    println("- Facilidade de identificação")
    println("- Melhor experiência de utilização")
}

// TELA 4 — LEITURA POR VOZ
fun telaLeituraVoz() {
    println("\n===== LEITURA POR VOZ =====")
    println("A proposta é oferecer informações")
    println("dos produtos por meio de áudio.")
    println("Recurso de tecnologia assistiva.")
}

// TELA 5 — QR CODE
fun telaQRCode() {
    println("\n===== LEITOR DE QR CODE =====")
    println("A proposta permite acessar informações")
    println("do produto por meio de QR Codes.")
    println("Integração com recursos acessíveis.")
}

// TELA 6 — PERFIL
fun telaPerfil() {
    println("\n===== PERFIL E PREFERÊNCIAS =====")
    println("Personalize sua experiência.")
    println("- Preferências de acessibilidade")
    println("- Recursos de leitura")
    println("- Configurações de utilização")
}
