fun main() {
    println("Bem-vinda ao app Bueno Doces!")

    val pedido = Pedido("Brigadeiro Gourmet", 12, "20/06/2025")
    pedido.exibirDetalhes()
}

data class Pedido(val produto: String, val quantidade: Int, val dataEntrega: String) {
    fun exibirDetalhes() {
        println("Produto: $produto")
        println("Quantidade: $quantidade")
        println("Data de Entrega: $dataEntrega")
    }
}
