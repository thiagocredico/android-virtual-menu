package com.example.trybevirtualmenu.models
import com.example.trybevirtualmenu.R

const val SIXTYFIVE = 65.00
const val FORTYFIVE = 45.00
const val EIGHTYFIVE = 85.00
const val NINETY = 90.00
const val TWENTY = 20.00
const val TEN = 10.00

const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5
const val SIX = 6

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val image: Int
)

object DishDatabase {

    private val dishes = listOf(
        Dish(
            ONE,
            "File de Carne com Fritas",
            "Uma suculenta porção de filé de carne grelhado na perfeição, servido " +
                "com deliciosas batatas fritas crocantes. Uma explosão de sabor que vai " +
                "satisfazer seus desejos mais carnívoros.",
            SIXTYFIVE,
            R.drawable.prato_01
        ),
        Dish(
            TWO,
            "Frango Grelhado com Legumess",
            "Uma opção saudável e saborosa: peitos de frango suculentos grelhados " +
                "à perfeição, acompanhados de legumes frescos, preparados para manter a " +
                "crocância e o sabor. Uma refeição leve e deliciosa para quem busca um " +
                "toque de frescor.",
            FORTYFIVE,
            R.drawable.prato_02
        ),
        Dish(
            THREE,
            "Mix de File de Carne e Frango Grelhados",
            "A melhor escolha para os indecisos! Uma combinação harmoniosa de filé " +
                "de carne suculento e peito de frango grelhado, oferecendo uma explosão " +
                "de sabores em cada garfada. Acompanhado de opções de molhos que tornam " +
                "essa escolha ainda mais especial.",
            EIGHTYFIVE,
            R.drawable.prato_03
        ),
        Dish(
            FOUR,
            "Picanha Grelhada com Macaxeira Frita",
            "Uma refeição de dar água na boca! Picanha de primeira qualidade, grelhada" +
                " à perfeição e servida com macaxeira frita crocante. Um prato que celebra o" +
                " melhor da culinária brasileira.",
            NINETY,
            R.drawable.prato_04
        ),
        Dish(
            FIVE,
            "Porção de Batatas Fritas com Molho",
            "Para os amantes de batatas, esta é a escolha ideal. Nossas batatas fritas" +
                " são cortadas e preparadas na hora para garantir a crocância perfeita." +
                " Acompanhadas de uma variedade de molhos incríveis que vão tornar cada" +
                " mordida ainda mais especial. Acompanhamento perfeito para qualquer refeição.",
            TWENTY,
            R.drawable.prato_05
        ),
        Dish(
            SIX,
            "Suco de Laranja",
            "Um gole de pura refrescância e vitalidade. Nosso suco de laranja é feito" +
                " com as laranjas mais suculentas e frescas, espremidas na hora para garantir" +
                " o sabor cítrico e natural que todos adoram. Perfeito para acompanhar suas" +
                " refeições ou para matar a sede a qualquer hora do dia. Deleite-se com o" +
                " gosto da natureza em um copo.",
            TEN,
            R.drawable.bebida_01
        )
    )

    fun getAllDishes(): List<Dish> = dishes
    fun getDishById(id: Int): Dish? = dishes.find { it.id == id }
}
