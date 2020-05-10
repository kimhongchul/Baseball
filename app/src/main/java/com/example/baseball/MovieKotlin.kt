package com.example.baseball

class MovieKotlin {

    var leadingActors:List<ActorKotlin>? = null
    var supportingActos:List<ActorKotlin>? = null
    var title:String? = null
    var showingAge:Int = 0
    var genre:String? = null

    class ActorKotlin {
        var realName:String? = null
        var stageName:String? = null
        var age:Int = 0
        var gender:String? = null
        var actedMovies:List<MovieKotlin>? = null
    }

    fun casting(movies:List<MovieKotlin>?):MutableList<ActorKotlin> {
        val recommandActors = mutableListOf<ActorKotlin>()

        movies?.forEach { movie ->
            if (movie?.title?.contains("도시") == true) {
                movie.leadingActors?.filter {
                    it?.gender == "W"
                            && it.age >= 20 && it.age < 30
                            && (it.actedMovies?.size ?: 0) > 5
                }?.forEach { it?.let { recommandActors.add(it) } }

                movie.supportingActos?.filter {
                    it?.gender == "M"
                            && it.age >= 30 && it.age < 40
                            && it.actedMovies?.filter { it?.genre == "공포" }?.size?: 0 > 0
                }?.forEach { it?.let { recommandActors.add(it) } }
            }
        }

        return recommandActors
    }
}