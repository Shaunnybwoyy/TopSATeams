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
        "Kaizer Chiefs",
        "Orlando Pirates",
        "Mamelodi Sundowns",
        "Cape Town City",
        "SuperSport United",
        "Golden Arrows",
        "AmaZulu FC",
        "Stellenbosch FC",
        "TS Galaxy",
        "Chippa United"
    )

    val shortestTeam = getShortestString(topSoccerTeams)
    println("Shortest team name: $shortestTeam")
}
