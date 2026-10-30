package com.loreal.brandstorm.kallos

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // TELA 1 — INICIAL E APRESENTAÇÃO
    println("==============================================")
    println("        KALLOS KAI POIKILLIA")
    println("           BRANDSTORM L'ORÉAL")
    println("==============================================")
    println("Bem-vindo à plataforma de Inclusão Digital!")
    println("Beleza, diversidade e acessibilidade universal.")
    println("A verdadeira beleza está na diversidade e na igualdade de acesso")

    // Menu principal
    while (true) {
        println("\n========== MENU PRINCIPAL ==========")
        println("1 - Acessibilidade e Inclusão (LBI & Legislação)")
        println("2 - Embalagens Ergonômicas e Braille (Tecnologia Tátil)")
        println("3 - Tecnologia de Leitura por Voz (Sintetizadores & Áudio)")
        println("4 - QR Code e Leitura de Produtos (Inclusão Digital)")
        println("5 - Perfil e Preferências (Personalização & LIBRAS)")
        println("6 - Sobre o Projeto & Impacto Social")
        println("0 - Sair")

        print("\nEscolha uma opção: ")

        when (scanner.nextLine().trim()) {
            "1" -> telaAcessibilidade()
            "2" -> telaEmbalagens()
            "3" -> telaLeituraVoz()
            "4" -> telaQRCode()
            "5" -> telaPerfil()
            "6" -> telaSobre()
            "0" -> {
                println("\nObrigado por conhecer o projeto Kallos kai Poikillia!")
                println("A verdadeira beleza está na diversidade e na igualdade de acesso.")
                break
            }
            else -> println("\nOpção inválida. Tente novamente.")
        }
    }
}

// TELA 2 — ACESSIBILIDADE E INCLUSÃO
fun telaAcessibilidade() {
    println("\n===== ACESSIBILIDADE E INCLUSÃO =====")
    println("A inclusão digital garante acesso equitativo a recursos tecnológicos.")
    println("• Conformidade com a Lei Brasileira de Inclusão (LBI).")
    println("• Navegação adaptada para deficiências visuais, auditivas, motoras e cognitivas.")
    println("• Soluções projetadas para barreiras permanentes, temporárias e situacionais.")
    println("• Interface com alto contraste, fontes ajustáveis e linguagem simples.")
}

// TELA 3 — EMBALAGENS ERGONÔMICAS
fun telaEmbalagens() {
    println("\n===== EMBALAGENS ERGONÔMICAS E BRAILLE =====")
    println("Tecnologia assistiva tátil aplicada ao design de produtos de consumo massivo:")
    println("• Identificação em Braille e marcações em alto-relevo.")
    println("• Mecanismos de fácil abertura (Easy-Open) para pessoas com restrições motoras.")
    println("• Texturas sensoriais para rápida diferenciação de linhas e fórmulas.")
    println("• Design ergonômico que proporciona autonomia no manuseio diário.")
}

// TELA 4 — LEITURA POR VOZ
fun telaLeituraVoz() {
    println("\n===== TECNOLOGIA DE LEITURA POR VOZ =====")
    println("Recurso de tecnologia assistiva focado em acessibilidade visual e leitura de tela:")
    println("• Leitura automática dos rótulos e ingredientes via sintetizador de voz (TTS).")
    println("• Audiodescrição detalhada do modo de uso, precauções e validade.")
    println("• Suporte para leitores de tela e comandos orientados por voz.")
}

// TELA 5 — QR CODE E LEITURA DE PRODUTOS
fun telaQRCode() {
    println("\n===== QR CODE E LEITURA DE PRODUTOS =====")
    println("Integração física e digital para eliminação de barreiras de informação:")
    println("• Escaneamento rápido do QR Code tátil impresso na embalagem.")
    println("• Acesso imediato a conteúdos acessíveis, incluindo tradução em LIBRAS.")
    println("• Consulta em tempo real de informações sobre fórmulas e testes de cor.")
}

// TELA 6 — PERFIL E PREFERÊNCIAS
fun telaPerfil() {
    println("\n===== PERFIL E PREFERÊNCIAS DE ACESSIBILIDADE =====")
    println("Personalize sua experiência na plataforma:")
    println("• Definição de perfis de visualização (Baixa Visão, Daltonismo, Modo Noturno).")
    println("• Configurações salvas de velocidade de leitura por voz.")
    println("• Canal direto de feedback contínuo para melhoria contínua dos produtos.")
}

// TELA SOBRE — L'ORÉAL BRANDSTORM
fun telaSobre() {
    println("\n===== SOBRE O PROJETO KALLOS KAI POIKILLIA =====")
    println("Iniciativa para o L'Oréal Brandstorm 2024.")
    println("• Conceito Grego: Kallos (Beleza) + Poikillia (Diversidade).")
    println("• Missão: Humanizar o mercado de consumo através da tecnologia inclusiva,")
    println("  promovendo empoderamento, igualdade de oportunidades e representatividade.")
}
