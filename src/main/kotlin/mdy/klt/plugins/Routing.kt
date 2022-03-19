package mdy.klt.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import mdy.klt.routes.randomAdele

fun Application.configureRouting() {
    

    routing {

        randomAdele()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
