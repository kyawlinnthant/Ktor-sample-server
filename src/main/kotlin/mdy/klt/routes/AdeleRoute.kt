package mdy.klt.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import mdy.klt.data.model.Adele

fun Route.randomAdele() {
    get(
        path = "/random-adele",
        body = {
            call.respond(
                status = HttpStatusCode.OK,
                message = adeleSongs.random()
            )
        }
    )
}

private const val BASE_URL = "http://localhost:8080"
private val adeleSongs = listOf(
    Adele(
        songName = "Rolling in the deep",
        description = "",
        imageUrl = "$BASE_URL/adele/adele1.jpeg"
    ),
    Adele(
        songName = "When we were young",
        description = "",
        imageUrl = "$BASE_URL/adele/adele2.jpeg"
    ),
    Adele(
        songName = "Send my love(to your new lover)",
        description = "",
        imageUrl = "$BASE_URL/adele/adele3.jpeg"
    ),
    Adele(
        songName = "Make you feel my love",
        description = "",
        imageUrl = "$BASE_URL/adele/adele4.jpeg"
    ),
    Adele(
        songName = "Someone like you",
        description = "",
        imageUrl = "$BASE_URL/adele/adele5.jpeg"
    ),
    Adele(
        songName = "Hello",
        description = "",
        imageUrl = "$BASE_URL/adele/adele6.jpeg"
    ),
)