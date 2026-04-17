package com.example.topsateams

fun getShortestString(arr: List<String>): String {
    var shortest = arr[0]

    for (team in arr) {
        if (team.length < shortest.length) {
            shortest = team
        }
    }

    return shortest
}

fun main() {
    val topSoccerTeams = listOf(
        "Real Madrid",
        "FC Barcelona",
        "Manchester City",
        "Bayern Munich",
        "Liverpool",
        "Chelsea",
        "PSG"
    )

    val shortestTeam = getShortestString(topSoccerTeams)
    println("Shortest team name: $shortestTeam")
}